/**
 Given a row sorted 2D binary array find the row with maximum number of 1's
 Link : https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1
 Time Complexity : O(rows+columns)
*/
import java.io.*;
public class MaxRowsWithOnesOptimised{

  static int getMaxOnesRows(int[][] array,int rowCount,int columnCount){
    int ans=-1,row=0,col=columnCount-1;
    while(row<rowCount && col>=0){
      if(array[row][col]==1){
        ans=row;
        col--;
      }
      else{
        row++;
      }
    }
    return ans;
  }

  public static void main(String[] args) throws IOException{
    int rows,columns;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of rows");
    rows =Integer.valueOf(br.readLine());
    System.out.println("Enter the number of columns");
    columns =Integer.valueOf(br.readLine());
    int[][] array = new int[rows][columns];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<rows;i++){
      for(int j=0;j<columns;j++){
        int value = (i*rows)+j;
        array[i][j] = Integer.valueOf(stringArray[value]);
      }
    }
    System.out.println("The row with max no. of 1's is "+getMaxOnesRows(array,rows,columns));
  }
}
