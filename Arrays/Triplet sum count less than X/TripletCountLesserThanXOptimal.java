/**
program to find the triplet count whose sum is less than X
Link : https://practice.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class TripletCountLesserThanXOptimal{

  static int countTriplets(int arr[], int n,int sum)
    {
        int ans=0;
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++)
        {
            int start = i+1,end = n-1;
            boolean isOccuring = false;
            while(start<end)
            {
                if(arr[i]+arr[start]+arr[end]<sum)
                {
                    ans +=(end-start);
                    start++;
                    isOccuring = true;
                }
                else
                {
                    end--;
                }
            }
            if(!isOccuring){
                break;
            }
        }
        return ans;
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
    System.out.println("Enter the sum");
    Integer sum = Integer.valueOf(br.readLine());
    System.out.println("The count is "+countTriplets(array,size,sum));
  }
}
