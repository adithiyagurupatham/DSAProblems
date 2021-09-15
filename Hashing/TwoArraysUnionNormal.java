/**
Program to find the union count of two arrays
Link : https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1/
Time Complexity : O(m^2+(n*(m*n)))
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class TwoArraysUnionNormal{

  static int doUnion(int a[], int n, int b[], int m)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        int ans=0;
        for(int each : a){
            if(!temp.contains(each)){
                ans++;
                temp.add(each);
            }
        }
        for(int each : b){
            if(!temp.contains(each)){
                ans++;
                temp.add(each);
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
    System.out.println("The total number of union elements are "
          +doUnion(array,array1,size,size1));
  }

}
