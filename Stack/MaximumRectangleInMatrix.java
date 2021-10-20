/**
Program to find the maximum area of the rectangle in binary matrix
Link : https://practice.geeksforgeeks.org/problems/max-rectangle/1
Time Complexity : O(R*C)
Space Complexity : O(C)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;
public class MaximumRectangleInMatrix{

  static int getMaxArea(int hist[], int n)
    {
      int ans=0;
     int left[]= new int[hist.length];
     int right[]= new int[hist.length];

     Deque<Integer> st= new ArrayDeque<>();

     left[0]=0;
     st.push(0);
     for(int i=1; i<hist.length; i++){
         while(!st.isEmpty() && hist[st.peek()]>=hist[i])
              st.pop();
          left[i] = (st.isEmpty())?0:st.peek()+1;
          st.push(i);
     }
     st.clear();
     right[hist.length-1]=hist.length-1;
     st.push(hist.length-1);
     for(int i=hist.length-2;i>=0;i--){
         while(!st.isEmpty() && hist[st.peek()]>=hist[i])
              st.pop();
          right[i]= (st.isEmpty())?hist.length-1:st.peek()-1;
          st.push(i);
     }

     for(int i=0; i<hist.length; i++){
         ans = Math.max(ans,(right[i]-left[i]+1)*hist[i]);
     }
     return ans;
    }

    static int maxArea(int matrix[][], int n, int m) {
        int ans = getMaxArea(matrix[0],m);
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==1){
                    matrix[i][j] += matrix[i-1][j];
                }
            }
            ans = Math.max(ans,getMaxArea(matrix[i],m));
        }

        return ans;
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of rows");
    Integer row = Integer.valueOf(br.readLine());
    System.out.println("Enter the number of columns");
    Integer col = Integer.valueOf(br.readLine());
    int[][] matrix = new int[row][col];
    System.out.println("Enter the elements");
    for(int i=0;i<row;i++){
      String[] stringArray = br.readLine().split(" ");
      for(int j=0;j<stringArray.length;j++){
        matrix[i][j] = Integer.valueOf(stringArray[j]);
      }
    }
    System.out.println("The maximum area is "+maxArea(matrix,row,col));
  }
}
