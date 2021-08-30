/**
Program to find the inversion count int the given array
A pair is considered as an inversion if i<j and arr[i]>arr[j]
Time Complexity : O(NlogN)
Space Complexity : O(N)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class InversionCountOptimal{

  static int mergeAndCount(int[] arr,int low,int mid,int high){
        int[] left = new int[mid-low+1];
        int[] right = new int[high-mid];
        int res=0;
        for(int i=0;i<left.length;i++){
            left[i] = arr[low+i];
        }
        for(int i=0;i<right.length;i++){
            right[i] = arr[mid+i+1];
        }
        int i=0,j=0,k=low;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                arr[k] = left[i];
                k++;
                i++;
            }
            else{
                res+=(left.length-i);
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        while(i<left.length){
                arr[k] = left[i];
                k++;
                i++;
        }
        while(j<right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
        return res;
    }

  static int split(int[] arr,int low,int high){
        int ans=0;
        if(low<high){
            int mid = low + ((high-low)/2);
            ans+=split(arr,low,mid);
            ans+=split(arr,mid+1,high);
            ans+=mergeAndCount(arr,low,mid,high);
        }
        return ans;
    }

  static int getInversionCount(int[] array){
    return split(array,0,array.length-1);
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
    System.out.println("The total inversion count is "+getInversionCount(array));
  }
}
