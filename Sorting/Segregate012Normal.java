/**
Program to segregate 0,1,2
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class Segregate012Normal{
  static void segregate(int arr[], int N)
    {
      int[] temp = new int[N];
      int i=0;
      for(Integer each : arr){
          if(each==0){
              temp[i++] = each;
          }
      }
      for(Integer each : arr){
          if(each==1){
              temp[i++] = each;
          }
      }
      for(Integer each : arr){
          if(each==2){
              temp[i++] = each;
          }
      }
      for(int j=0;j<N;j++){
          arr[j] = temp[j];
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
    segregate(array, size);
    System.out.println("After segregation "+Arrays.toString(array));
  }
}
