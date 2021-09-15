/**
Program to print the non - repeating elements in the given array
Link : https://practice.geeksforgeeks.org/problems/print-distinct-elements-1587115620/1/
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class PrintNonRepeatedElementsNormal{

  static ArrayList<Integer> printNonRepeated(int arr[], int n)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int each : arr){
            if(set.contains(each)){
                ans.remove((Integer)each);
            }
            else{
                set.add(each);
                ans.add(each);
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
    System.out.println("The distinct element count is "+printNonRepeated(array, size));

  }

}
