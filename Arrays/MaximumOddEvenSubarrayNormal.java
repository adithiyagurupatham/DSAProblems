/**
Program to maximum length alternating odd even subarray
Link : https://www.geeksforgeeks.org/length-of-the-longest-alternating-even-odd-subarray/
Time Complexity : O(N^2)
*/
import java.io.*;
public class MaximumOddEvenSubarrayNormal{

  static boolean isEven(int number){
        return (number%2)==0;
    }
    public static int maxEvenOdd(int arr[], int n)
    {
        int max=1,count=1;
        boolean isEven = false;
        for(int i=0;i<n;i++){
            isEven = !(isEven(arr[i]));
            count=1;
            for(int j=i+1;j<n;j++){
                if(isEven(arr[j])==isEven){
                    isEven = !isEven;
                    count++;
                    if(count>max){
                        max = count;
                    }
                }
                else{
                        count=1;
                    }
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
