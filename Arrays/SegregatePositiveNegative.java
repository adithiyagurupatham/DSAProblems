/**
Program to segregate positive and negative numbers seperately
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SegregatePositiveNegative{
  static void swap(int[] array,int i,int j){
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
  static void segregate(int[] array,int n){
    int left=0,right=n-1;
    while(true){
      while(left<n && array[left]>0){
        left++;
      }
      if(left>=n-1){
        break;
      }
      while(right>0 && array[right]<0){
        right--;
      }
      if(right<=0){
        break;
      }
      swap(array,left,right);
      left++;
      right--;
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
    segregate(array,size);
    System.out.println("Post segregation the array is ");
    for(int i=0;i<size;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
}
