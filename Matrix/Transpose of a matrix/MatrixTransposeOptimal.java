/**
Program to print the transpose of the matrix
Link : https://practice.geeksforgeeks.org/problems/transpose-of-matrix-1587115621/1/
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class MatrixTransposeOptimal{

  static void swap(int[][] arr,int src,int dest){
        int temp = arr[src][dest];
        arr[src][dest] = arr[dest][src];
        arr[dest][src] = temp;
    }
    
    static void transpose(int matrix[][], int n)
    {
        // code here
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[i].length;j++){
                swap(matrix,i,j);
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
    transpose(matrix, row);
    System.out.println("Post traversal the matrix becomes " +Arrays.deepToString(matrix));
  }
}
