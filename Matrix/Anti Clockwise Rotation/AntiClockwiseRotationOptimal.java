/**
Program to rotate the matrix in anti-clockwise direction
Link : https://practice.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1/
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class AntiClockwiseRotationOptimal{

  static void swap(int[][] matrix,int i,int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

  static void rotateby90(int matrix[][], int n)
    {
      for(int i=0;i<n;i++){
          for(int j=i;j<n;j++){
              swap(matrix,i,j);
          }
      }

      for(int i=0;i<n;i++){
          int low=0,high = n-1;
          while(low<high){
              int temp = matrix[low][i];
              matrix[low][i] = matrix[high][i];
              matrix[high][i] = temp;
              low++;
              high--;
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
    rotateby90(matrix, row);
    System.out.println("Post rotation the array becomes " +Arrays.deepToString(matrix));
  }
}
