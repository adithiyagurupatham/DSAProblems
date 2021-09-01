/**
Program to return the last occurance of the pivot element through Hoare partition
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class HoarePartition{

  static int getHoarePartition(int[] arr,int low,int high){
        int pivot = arr[low];
        int i=low-1,j=high+1;
        while(true){
            do{
              i++;
            }while(arr[i]<pivot);
            do{
              j--;
            }while(arr[j]>pivot);
            if(i>=j){
              return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
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
    System.out.println("The pivot index is "+getHoarePartition(array,0,array.length-1));
  }
}
