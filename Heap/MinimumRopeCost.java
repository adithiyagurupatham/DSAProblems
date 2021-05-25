/**
program to find minimum rope cost
Link : https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1#
*/
import java.io.*;
import java.util.*;
public class MinimumRopeCost{

  static int getMinimumRopeCost(int[] array){
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int each : array){
      pq.add(each);
    }

    int ans=0;
    while(pq.size()>1){
      int ele1 = pq.poll();
      int ele2 = pq.poll();
      ans+=(ele1+ele2);
      pq.add(ele1+ele2);
    }
    return ans;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the  array size");
    Integer input = Integer.valueOf(br.readLine());
    System.out.println("Enter the elements");
    String[] arrayString = br.readLine().split(" ");
    int[] array = new int[input];
    for(int i=0;i<arrayString.length;i++){
      array[i] = Integer.valueOf(arrayString[i]);
    }
    System.out.println("The minimum rope cost is "+getMinimumRopeCost(array));
  }
}
