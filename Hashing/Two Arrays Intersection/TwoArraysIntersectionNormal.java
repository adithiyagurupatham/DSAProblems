/**
Program to find the intersection count of two arrays
Link : https://practice.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1/
Time Complexity : O(m*(m+n))
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class TwoArraysIntersectionNormal{

  static int numberofElementsInIntersection(int a[], int b[], int m, int n) {
        int ans =0;
        for(int i=0;i<m;i++){
            boolean flag = false;
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    flag = true;
                    break;
                }
            }
            if(flag)
            {
                continue;
            }
            for(int j=0;j<n;j++){
                if(a[i]==b[j]){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Integer.valueOf(stringArray[i]);
    }
    System.out.println("Enter the number of elements for second array");
    Integer size1 = Integer.valueOf(br.readLine());
    int[] array1 = new int[size1];
    System.out.println("Enter the second array elements");
    stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array1[i] = Integer.valueOf(stringArray[i]);
    }
    System.out.println("The total number of intersecting elements is "
          +numberofElementsInIntersection(array,array1,size,size1));
  }

}
