/**
Program to check if both the arrays are identical and equal
Link : https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1/
Time Complexity : O(m+n)
Space Complexity : O(m+n)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class TwoArraysEquality{

  public static boolean check(int A[],int B[],int N)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int each : A){
            map.merge(each,1,Integer :: sum);
        }
        for(int each : B){
            map1.merge(each,1,Integer :: sum);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int count = entry.getValue();
            Integer key = entry.getKey();
            if((!map1.containsKey(key)) || map1.get(key)!=count){
                return false;
            }
        }
        return true;
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
    int[] array1 = new int[size];
    System.out.println("Enter the second array elements");
    stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array1[i] = Integer.valueOf(stringArray[i]);
    }
    System.out.println("The arrays equality status is "
          +check(array, array1, size));
  }

}
