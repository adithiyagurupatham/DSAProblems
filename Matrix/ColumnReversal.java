/**
Program to reverse the column of the matrix
Link : https://practice.geeksforgeeks.org/problems/reversing-the-columns-of-a-matrix-1587115621/1/
Time Complexity : O(m*n)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class ColumnReversal{

  static void reverseCol(int matrix[][])
    {
        // code here
        int col = matrix[0].length,row = matrix.length;
        int low=0,high = col-1;
        while(low<high){
            for(int i=0;i<row;i++){
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
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
    reverseCol(matrix);
    System.out.println("Post column reeversal the matrix is  " +Arrays.deepToString(matrix));
  }
}
