/**
Check if the sum equals to the subset sum
Link : https://www.interviewbit.com/problems/subset-sum-problem/
*/
import java.io.*;
public class SubsetSum{
  static boolean isSubsetSumPresent(int[] A, int ans) {
        for(int mask=0;mask<(1<<A.length);mask++){
            int sum=0;
            for(int i=0;i<A.length;i++){
                int F = 1<<i;
                if((mask&F)>0){
                    sum+=A[i];
                }
            }
            if(sum==ans){
                return true;
            }
        }
        return false;
    }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the array size");
    Integer input = Integer.valueOf(br.readLine());
    System.out.println("Enter the elements");
    String[] arrayString = br.readLine().split(" ");
    int[] array = new int[input];
    for(int i=0;i<arrayString.length;i++){
      array[i] = Integer.valueOf(arrayString[i]);
    }
    System.out.println("Enter the sum");
    Integer sum = Integer.valueOf(br.readLine());
    System.out.println("The subset sum is present "+isSubsetSumPresent(array,sum));
  }
}
