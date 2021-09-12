/**
Program to multiply two matrices
Link : https://practice.geeksforgeeks.org/problems/multiply-the-matrices-1587115620/1/
Time Complexity : O(n1*m1*m2)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class MatrixMultiplication{

  static int sum(int[] arr,int[][] brr,int col){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=(arr[i]*brr[i][col]);
        }
        return ans;
    }

    static int[][] multiplyMatrix(int A[][], int B[][])
    {
        int[][] ans = new int[0][0];
        if(A[0].length!=B.length){
            return ans;
        }
        ans = new int[A.length][B[0].length];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                ans[i][j] = sum(A[i],B,j);
            }
        }
        return ans;
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
    System.out.println("Enter the second row count");
    Integer row1 = Integer.valueOf(br.readLine());
    System.out.println("Enter the second column count");
    Integer col1 = Integer.valueOf(br.readLine());
    int[][] matrix1 = new int[row1][col1];
    System.out.println("Enter the second matrix elements");
    for(int i=0;i<row1;i++){
      inputString = br.readLine().split(" ");
      for(int j=0;j<col1;j++){
        matrix1[i][j] =  Integer.valueOf(inputString[j]);
      }
    }
    int[][] ans = multiplyMatrix(matrix, matrix1);
    System.out.println("The matrix multiplication result is  " +Arrays.deepToString(ans));
  }
}
