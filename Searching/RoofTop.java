/**
Program to find the maximum consecutive increasing array
Link : https://practice.geeksforgeeks.org/problems/roof-top-1587115621/1
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class RoofTop{

  static int maxStep(int A[], int N)
    {
        int maxCount=0,temp=0;
        for(int i=0;i<N-1;i++){
            if(A[i]<A[i+1]){
                temp++;
                maxCount = Math.max(maxCount,temp);
            }
            else{
                temp=0;
            }
        }
        return maxCount;
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the fir input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("The maximum consecutive increasing steps is "+maxStep(array,size));
  }
}
