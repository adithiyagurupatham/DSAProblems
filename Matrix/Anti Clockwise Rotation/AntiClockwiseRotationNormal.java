/**
Program to rotate the matrix in anti-clockwise direction
Link : https://practice.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1/
Time Complexity : O(N^2)
Space Complexity : O(N^2)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class AntiClockwiseRotationNormal{

  static void rotateby90(int matrix[][], int n)
    {
        int[][] temp = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[n-1-j][i] = matrix[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = temp[i][j];
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
