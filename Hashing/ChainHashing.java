/**
Program to implement chain hashing using arraylist
Link : https://practice.geeksforgeeks.org/problems/separate-chaining-in-hashing-1587115621/1/
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
public class ChainHashing{

  public static ArrayList<ArrayList<Integer>> separateChaining(int arr[], int n, int hashSize)
    {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0;i<hashSize;i++){
            ans.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++){
            int idx = arr[i]%hashSize;
            ans.get(idx).add(arr[i]);
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
    System.out.println("Enter the hashtable size");
    Integer hashSize = Integer.valueOf(br.readLine());
    ArrayList<ArrayList<Integer>> res = separateChaining(array, size, hashSize);
    for(int i=0;i<res.size();i++){
      if(res.get(i).size()>0){
        System.out.print(i+"->");
        for(int j=0;j<res.get(i).size()-1;j++){
          System.out.print(res.get(i).get(j)+"->");
        }
        System.out.print(res.get(i).get(res.get(i).size()-1));
        System.out.println();
      }
    }

  }

}
