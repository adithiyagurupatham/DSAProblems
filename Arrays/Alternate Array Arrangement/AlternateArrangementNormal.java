/**
Program to rearrange the array as max-min combo
Link : http://practice.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class AlternateArrangementNormal{
  static void rearrange(int arr[], int n){
        int[] temp = new int[n];
        int left=0,right=n-1,i=0;
        while(left<=right){
            temp[i++]=arr[right--];
            if(i==n){
                break;
            }
            temp[i++] = arr[left++];
        }
        for(int j=0;j<n;j++)
            arr[j]=temp[j];

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
    rearrange(array,size);
    System.out.println("Post arrangement array is ");
    for(int i=0;i<size;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
}
