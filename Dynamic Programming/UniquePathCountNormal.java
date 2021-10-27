/**
Program to find the count of unique paths to the destination
Link : https://practice.geeksforgeeks.org/problems/number-of-unique-paths5339/1
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class UniquePathCountNormal{

  static int findPathCount(int x,int y,int a,int b){
        int ans=0,ans1=0;
        if(x==a-1 && y==b-1){
            return 1;
        }
        if(x>=a && y>=b){
            return 0;
        }
        if(y<b){
             ans = findPathCount(x,y+1,a,b);
        }
        if(x<a){
            ans1 = findPathCount(x+1,y,a,b);
        }
        return  ans+ans1;
    }

  static int numberOfPath(int a, int b)
    {
        return findPathCount(0,0,a,b);
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the row count");
    Integer row = Integer.valueOf(br.readLine());
    System.out.println("Enter the column count");
    Integer col = Integer.valueOf(br.readLine());
    System.out.println("The number of unique path is "+numberOfPath(row, col));
  }
}
