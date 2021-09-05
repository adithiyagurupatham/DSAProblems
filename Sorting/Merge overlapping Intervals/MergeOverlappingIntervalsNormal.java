/**
Program to print the non - overlapping intervals of the array
Link : https://www.geeksforgeeks.org/merging-intervals/
Time Complexity : O(NlogN)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Stack;
class Interval implements Comparable<Interval>{
  int s;
  int e;
  Interval(int s,int e){
    this.s = s;
    this.e = e;
  }

  public int compareTo(Interval s){
    return this.s - s.s;
  }

  @Override
  public String toString(){
    return "["+this.s+","+this.e+"]";
  }

}

public class MergeOverlappingIntervalsNormal{
  static void findOverlappingIntervals(Interval[] arr)
    {
      Arrays.sort(arr);
      Stack<Interval> stack = new Stack<>();
      stack.push(arr[0]);
      for(int i=1;i<arr.length;i++){
        Interval top = stack.peek();
        if(top.e >= arr[i].s){
          top.e = Math.max(top.e,arr[i].e);
          stack.pop();
          stack.push(top);
        }
        else{
          stack.push(arr[i]);
        }
      }
      while(!stack.isEmpty()){
        Interval t = stack.pop();
        System.out.print("["+t.s+","+t.e+"] ");
      }
      System.out.println();
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Interval arr[] = { new Interval(3,5),new Interval(2,6),new Interval(1,3),
                                        new Interval(1,2) };
    System.out.println("The non overlapping intervals are ");
    findOverlappingIntervals(arr);
  }
}
