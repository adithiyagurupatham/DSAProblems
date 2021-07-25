/**
Program to rearrange the array as max-min combo
Link : http://practice.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class AlternateArrangementOptimal{
  static void rearrange(int arr[], int n){
    int left=0,right=n-1,max=arr[n-1]+1;
    for(int i=0;i<n;i++){
        if(i%2==0){
            //even
            int temp = (arr[right]*max);
            arr[i]+=((arr[right]%max)*max);
            right--;
        }
        else{
            arr[i]+=((arr[left]%max)*max);
            left++;
        }
    }
    for(int i=0;i<n;i++){
        arr[i]=arr[i]/max;
    }

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
