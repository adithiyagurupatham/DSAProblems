/**
Program to make the rows and columns of matrix to 1 if there is anyone occurance of 1
Link : https://practice.geeksforgeeks.org/problems/boolean-matrix-problem-1587115620/1/
Time Complexity : O(m*n)
Space Complexity : O(m+n)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class BooleanMatrix{

  static void booleanMatrix(int matrix[][])
   {
       // code here
       int row = matrix.length,col = matrix[0].length,r=0,c=0;
       int[] rowCount = new int[row];
       int[] colCount = new int[col];
       for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               if(matrix[i][j]==1){
                   rowCount[i]=1;
                   colCount[j]=1;
               }
           }
       }
       for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               if(rowCount[i]==1 || colCount[j]==1){
                   matrix[i][j]=1;
               }
           }
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
    booleanMatrix(matrix);
    System.out.println("Post column reeversal the matrix is  " +Arrays.deepToString(matrix));
  }
}
