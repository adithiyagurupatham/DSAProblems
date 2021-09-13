/**
Program to search an element in row sorted and column sorted matrix
Link : https://practice.geeksforgeeks.org/problems/search-in-a-matrix-1587115621/1/
Time Complexity : O(row+col)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class RowColSortedSearchOptimal{

  static boolean search(int matrix[][], int n, int m, int x)
	{
    int i=0,j=m-1;
    while(i<n && j>=0){
        if(matrix[i][j] == x){
            return true;
        }
        else if(matrix[i][j]>x){
            j--;
        }
        else{
            i++;
        }
    }
    return false;
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
    System.out.println("Enter the element to be searched");
    Integer x = Integer.valueOf(br.readLine());
    System.out.println("The status of the element is " +search(matrix,row,col,x));
  }
}
