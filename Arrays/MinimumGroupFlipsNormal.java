/**
Program to convert all elements as same with minimum number of consecutive flips
Link : https://www.geeksforgeeks.org/minimum-group-flips-to-make-binary-array-elements-same/
Time Complexity : O(N)
SPace Complexity : O(1)
*/
import java.io.*;
public class MinimumGroupFlipsNormal{
  static void printMinimumGroupFlips(int[] array){
    int zeroCount=0,oneCount=0,i=0,n=array.length;
    while(i<n){
      if(i<n && array[i]==1){
        oneCount++;
      }
      while(i<n && array[i]==1){
        i++;
      }
      if(i<n && array[i]==0){
        zeroCount++;
      }
      while(i<n && array[i]==0){
        i++;
      }
    }
    i=0;
    int value = (zeroCount<=oneCount)?0:1;
    while(i<n){
        while(i<n && array[i]==(value^1)){
          i++;
        }
        if(i<n){
          System.out.print("Start is : "+i);
          i++;
        }
        while(i<n && array[i]==value){
          i++;
        }
        if(i<n){
          System.out.print(" End is : "+(i-1));
          System.out.println();
          i++;
        }
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
    printMinimumGroupFlips(array);
  }
}
