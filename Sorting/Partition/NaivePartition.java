/**
Program to return the last occurance of the pivot element through naive partition
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class NaivePartition{

  static int getNaivePartition(int[] arr,int low,int high,int partition){
        int[] temp = new int[high-low+1];
        int index=0;
        for(int i=low;i<=high;i++){
          if(arr[i]<arr[partition]){
            temp[index++] = arr[i];
          }
        }
        for(int i=low;i<=high;i++){
          if(arr[i]==arr[partition]){
            temp[index++] = arr[i];
          }
        }
        int ans = low+index-1;
        for(int i=low;i<=high;i++){
          if(arr[i]>arr[partition]){
            temp[index++] = arr[i];
          }
        }
        for(int i=0;i<temp.length;i++){
          arr[low+i] = temp[i];
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
    System.out.println("Enter the partition index");
    Integer partitionIndex = Integer.valueOf(br.readLine());
    System.out.println("The partitionIndex is "+getNaivePartition(array,0,array.length-1,partitionIndex));
  }
}
