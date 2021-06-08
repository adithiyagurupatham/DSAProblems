/**
Program to find the subset sum count
*/
import java.io.*;
public class SubSetSumCountLeftToRight{

  static int getSubsetSumCount(int[] array,int sum,int val,int n){
    if(n==array.length){
      return (sum==val)?1:0;
    }
    n++;
    return getSubsetSumCount(array,sum,val+array[n-1],n)+getSubsetSumCount(array,sum,val,n);
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
    System.out.println("The subset sum count is "+getSubsetSumCount(array,sum,0,0));
  }
}
