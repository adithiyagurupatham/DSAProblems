/**
Program to print the snake pattern
Link : https://practice.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/1/
Time Complexity : O(row*col)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class SnakePatternPrinting{

  static void snakePattern(int matrix[][])
    {
        boolean isLeft = true;
        for(int i=0;i<matrix.length;i++){
            if(isLeft){
                for(int j=0;j<matrix[i].length;j++){
                    System.out.print(matrix[i][j]);
                }
            }
            else{
                for(int j=matrix[i].length-1;j>=0;j--){
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
            isLeft = !(isLeft);
        }
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the row count");
    Integer row = Integer.valueOf(br.readLine());
    System.out.println("Enter the column count");
    Integer col = Integer.valueOf(br.readLine());
    int[][] matrix = new int[row][];
    System.out.println("Enter the elements");
    for(int i=0;i<row;i++){
      matrix[i] = new int[col];
      for(int j=0;j<col;j++){
        matrix[i][j] =  Integer.valueOf(br.readLine());
      }
    }
    System.out.println("The snake pattern is ");
    snakePattern(matrix);
  }
}
