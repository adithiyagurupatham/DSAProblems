/**
Program to sort the binary array (contains 0/1)
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class BinarySortingOptimal{
  static void sortBinaryArray(int A[], int N)
    {
      int i=-1,j=N;
        while(true){
            do{
               i++;
            }while(i<N && A[i]==0);
            do{
                j--;
            }while(j>0 && A[j]==1);
            if(i>=j){
                return;
            }
            int temp = A[i];
            A[i]=A[j];
            A[j] = temp;
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
    sortBinaryArray(array,size);
    System.out.println("After sorting the array is  "+Arrays.toString(array));
  }
}
