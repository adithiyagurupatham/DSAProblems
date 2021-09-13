/**
Program to reverse the rows of the matrix
Link : https://practice.geeksforgeeks.org/problems/reversing-the-rows-of-a-matrix-1587115621/1/
Time Complexity : O(m*n)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class RowReversal{

  static void interchangeRows(int matrix[][])
    {
        // code here
        int row = matrix.length,col = matrix[0].length;
        int low=0,high = row-1;
        while(low<high){
            for(int i=0;i<col;i++){
                int temp = matrix[low][i];
                matrix[low][i] = matrix[high][i];
                matrix[high][i] = temp;
            }
            low++;
            high--;
        }
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
    interchangeRows(matrix);
    System.out.println("Post column reeversal the matrix is  " +Arrays.deepToString(matrix));
  }
}
