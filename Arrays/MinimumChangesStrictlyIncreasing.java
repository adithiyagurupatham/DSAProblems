/**
   An array nums is strictly increasing if nums[i] < nums[i+1] for all
   0 <= i < nums.length - 1. An array of length 1 is trivially strictly increasing.

   LeetCode link : https://leetcode.com/contest/biweekly-contest-50/problems/minimum-operations-to-make-the-array-increasing/
*/

import java.util.*;
import java.io.*;
public class MinimumChangesStrictlyIncreasing{
  static int getMinimumChanges(int[] array){
    int counter =0;
        for(int i=0;i<array.length-1;i++){
            while(array[i]>=array[i+1]){
                counter++;
                array[i+1] = array[i+1]+1;
            }
        }
        return counter;
  }
  public static void main(String[] args){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
  }
}
