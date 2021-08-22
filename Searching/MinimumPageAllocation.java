/**
Program to find the minimum possible cosecutive pages that can be allocated to the student
Link : https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1/
Time Complexity : O(NlogN)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MinimumPageAllocation{

  static int findPages(int[]A,int N,int M)
    {
        int low=A[0],res=-1,high=0;
        for(int each : A){
            high+=each;
        }
        while(low<=high){
            int mid = low+((high-low)/2);
            if(isPossible(A,mid,M)){
                res = mid;
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }

    static boolean isPossible(int[] arr,int mid,int M){
        int studentCount=1,pagesAllocated=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mid){
                return false;
            }
            if(arr[i]+pagesAllocated>mid){
                pagesAllocated = arr[i];
                studentCount++;
            }
            else{
                pagesAllocated += arr[i];
            }
        }
        return studentCount<=M;
    }
  
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the  input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the pages");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("Enter the  student count");
    Integer studentCount = Integer.valueOf(br.readLine());
    System.out.println("The minimum number of pages that need to be allocated is "+findPages(array, size, studentCount));
  }
}
