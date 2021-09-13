/**
Program to find the minimum number of operations required to make the row sum and col sum equal
Link : https://practice.geeksforgeeks.org/problems/make-matrix-beautiful-1587115620/1/
Time Complexity : O(m*n)
Space Complexity : O(m+n)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class MinimumOperationsRequired{

  static int findMinOperation(int matrix[][], int n)
    {
        // code here
        int[] rowSum = new int[n];
        int[] colSum = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rowSum[i]+=matrix[i][j];
                colSum[j]+=matrix[i][j];
            }
        }
        int count=0,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max,rowSum[i]);
            max = Math.max(max,colSum[i]);
        }
        for(int i=0,j=0;i<n && j<n;){
            int diff = Math.min(max-rowSum[i],max-colSum[j]);
            count+=diff;
            rowSum[i]+=diff;
            colSum[j]+=diff;
            if(rowSum[i]==max){
                i++;
            }
            if(colSum[j]==max){
                j++;
            }
        }

        return count;
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the row count");
    Integer row = Integer.valueOf(br.readLine());
    System.out.println("Enter the column count");
    Integer col = Integer.valueOf(br.readLine());
    int[][] matrix = new int[row][col];
    System.out.println("Enter the elements");
    String[] inputString;
    for(int i=0;i<row;i++){
      inputString = br.readLine().split(" ");
      for(int j=0;j<col;j++){
        matrix[i][j] =  Integer.valueOf(inputString[j]);
      }
    }
    System.out.println("The minimum operations required is " +findMinOperation(matrix, row));
  }
}
