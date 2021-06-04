/**
Program to find the subset sum count
*/
import java.io.*;
public class SubSetSumCountRightToLeft{

  static int getSubsetSumCount(int[] array,int sum,int n){
    if(n==0){
      return (sum==0)?1:0;
    }
    n--;
    return getSubsetSumCount(array,sum-array[n],n)+getSubsetSumCount(array,sum,n);
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i]=Integer.valueOf(stringArray[i]);
    }
    System.out.println("Enter the subset sum");
    Integer sum = Integer.valueOf(br.readLine());
    System.out.println("The subset sum count is "+getSubsetSumCount(array,sum,array.length));
  }
}
