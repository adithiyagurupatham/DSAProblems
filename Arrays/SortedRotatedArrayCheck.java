/**
Program to check if the given is sorted and rotated in counter - clockwise direction
Link : https://practice.geeksforgeeks.org/problems/check-if-array-is-sorted-and-rotated-clockwise-1587115620/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SortedRotatedArrayCheck{

  static boolean checkRotatedAndSorted(int arr[], int num){
        int desCount=0,ascCount=0;
        for(int i=0;i<num-1;i++){
            if(arr[i]<=arr[i+1])
                desCount++;
            if(arr[i]>=arr[i+1])
                ascCount++;
        }
        if((desCount==num-2)&&(arr[0]>=arr[num-1])){
            return true;
        }
        else if((ascCount==num-2) && (arr[0]<=arr[num-1])){
            return true;
        }
        return false;
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("The array sorted rotated status is "+checkRotatedAndSorted(array,size));
  }
}
