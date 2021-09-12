/**
Program to print the boundary elements of the matrix
Link : https://practice.geeksforgeeks.org/problems/boundary-traversal-of-matrix-1587115620/1/
Time Complexity : O(m+n)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
public class BoundaryTraversalPrinting{

  static ArrayList<Integer> boundaryTraversal(int matrix[][], int m, int n)
    {

        ArrayList<Integer> ans = new ArrayList<>();
        if(m==1){
            for(int i=0;i<n;i++){
                ans.add(matrix[0][i]);
            }
        }
        else if(n==1){
            for(int i=0;i<m;i++){
                ans.add(matrix[i][0]);
            }
        }
        else{
            for(int i=0;i<n;i++){
                ans.add(matrix[0][i]);
            }
            for(int i=1;i<m;i++){
                ans.add(matrix[i][n-1]);
            }
            for(int i=n-2;i>=0;i--){
                ans.add(matrix[m-1][i]);
            }
            for(int i=m-2;i>0;i--){
                ans.add(matrix[i][0]);
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
    System.out.println("The boundary elements are " +boundaryTraversal(matrix,row,col));
  }
}
