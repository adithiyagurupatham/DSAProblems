/**
Program to print the non - overlapping intervals of the array
Link : https://www.geeksforgeeks.org/merging-intervals/
Time Complexity : O(NlogN)
Space Complexity : O(N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Stack;
import java.lang.Math;
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

public class MergeOverlappingIntervalsOptimal{
  static void findOverlappingIntervals(Interval[] arr)
    {
      Arrays.sort(arr);
      int res=0;
      for(int i=1;i<arr.length;i++){
        if(arr[res].e >=arr[i].s){
          arr[res].e = Math.max(arr[res].e,arr[i].e);
        }
        else{
          res++;
          arr[res]=arr[i];
        }
      }
      for(int t=0;t<=res;t++){
        System.out.print("["+arr[t].s+","+arr[t].e+"] ");
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
