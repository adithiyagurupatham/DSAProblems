/**
Program to maximum length alternating odd even subarray
Link : https://www.geeksforgeeks.org/length-of-the-longest-alternating-even-odd-subarray/
Time Complexity : O(N)
*/
import java.io.*;
public class MaximumOddEvenSubarrayOptimal{


    public static int maxEvenOdd(int arr[], int n)
    {
        // your code here
        int max=1,count=1;
        for(int i=1;i<n;i++){
            if((arr[i]%2==0 && arr[i-1]%2==1) || (arr[i]%2==1 && arr[i-1]%2==0)){
                count++;
                max = Math.max(max,count);
            }
            else{
                count=1;
            }
        }
        return max;
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer number = Integer.valueOf(br.readLine());
    int[] array = new int[number];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Integer.valueOf(stringArray[i]);
    }
    System.out.println("The maximum even odd subarray is "+maxEvenOdd(array,number));
  }
}
