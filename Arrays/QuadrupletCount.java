/**
Given an array arr[] of size N and an integer S, the task is to find the count
 of quadruplets present in the given array having sum S

 Link : https://www.geeksforgeeks.org/count-quadruplets-with-sum-k-from-given-array/
*/

import java.io.*;
import java.util.*;
public class QuadrupletCount{
  static int getQuadrupletCount(int[] array,int sum){
    int counter=0;
    int n = array.length;
    for(int i=0;i<n-3;i++){
      for(int j=i+1;j<n-2;j++){
        Map<Integer,Integer> hashMap = new HashMap<>();
        int required = sum-array[i]-array[j];
        for(int k=j+1;k<n;k++){
          if(hashMap.containsKey(required-array[k])){
            counter++;
          }
          if(hashMap.containsKey(required-array[k])){
            hashMap.put(array[k],hashMap.get(required-array[k])+1);
          }
          else{
            hashMap.put(array[k],1);
          }
        }
      }
    }
    return counter;
  }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(stringArray[i]);
    }
    System.out.println("Enter the sum");
    Integer sum = Integer.valueOf(br.readLine());
    System.out.println("The pair count is "+getQuadrupletCount(array,sum));
  }
}
