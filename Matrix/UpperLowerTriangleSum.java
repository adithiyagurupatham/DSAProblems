/**
Program to print the upper and lower triangle sum of the matrix
Link : https://practice.geeksforgeeks.org/problems/sum-of-upper-and-lower-triangles-1587115621/1/
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
public class UpperLowerTriangleSum{

  static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        int upper=0,lower=0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                    upper+=matrix[i][j];
            }
            for(int j=0;j<=i;j++){
                    lower+=matrix[i][j];
            }

        }
        ans.add(upper);
        ans.add(lower);
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
    System.out.println("The sum of triangles  are " +sumTriangles(matrix, row));
  }
}
