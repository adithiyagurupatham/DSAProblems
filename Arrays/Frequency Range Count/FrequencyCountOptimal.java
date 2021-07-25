/**
Link : https://practice.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.*;
import java.util.Map;
import java.util.HashMap;
public class FrequencyCountOptimal{

  static void frequencyCount(int arr[], int N, int P){
    Map<Integer,Integer> hashMap = new HashMap<>();
        for(int each : arr){
            hashMap.merge(each,1,Integer :: sum);
        }
        for(int i=0;i<N;i++){
            if(hashMap.containsKey(i+1)){
                arr[i]=hashMap.get(i+1);
            }
            else{
                arr[i]=0;
            }
        }
        hashMap.clear();
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the value of P");
    Integer P = Integer.valueOf(br.readLine());
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
    frequencyCount(array,size,P);
    System.out.println("Post transformation array is ");
    for(int i=0;i<size;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
}
