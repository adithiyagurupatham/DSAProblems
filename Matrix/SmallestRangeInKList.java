/**
Program to find the minimum range in k lists such that it contains atleast one element in each row
Time Complexity : O(n*k*log(k))
Space Complexity : O(k)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Arrays;
public class SmallestRangeInKList
{

  static class Ele
    {
        int index;
        int val;

        Ele(int index,int val)
        {
            this.index = index;
            this.val = val;
        }
    }

	static int[] findSmallestRange(int[][] arr,int n,int k)
	{
	    //add your code here
	    int[] ans = new int[2];
	    PriorityQueue<Ele> pq = new PriorityQueue<>((v,w) -> {
	           return v.val-w.val;
	        });
	   int currMin = Integer.MAX_VALUE;
	   int min = Integer.MAX_VALUE;
	   int range = Integer.MAX_VALUE;
	   int currMax = Integer.MIN_VALUE;
	   int max = Integer.MIN_VALUE;
	   int[] ptrList = new int[k];
	   for(int i=0;i<arr.length;i++)
	   {
	       Ele ele = new Ele(i,arr[i][0]);
	       if(arr[i][0]>currMax)
	       {
	           currMax = arr[i][0];
	       }
	       pq.add(ele);
	   }
	   while(true)
	   {
	     Ele ele =  pq.poll();
	     currMin = ele.val;
	     int listIndex = ele.index;
	     if((currMax-currMin)<range)
	     {
	         range = currMax-currMin;
	         min = currMin;
	         max = currMax;
	     }
	     if(ptrList[listIndex]+1 < n)
	     {
	         ptrList[listIndex]++;
	         Ele next = new Ele(listIndex,arr[listIndex][ptrList[listIndex]]);
	         if(next.val>currMax){
	             currMax = next.val;
	         }
	         pq.add(next);

	     }
	     else
	     {
	         ans[0] = min;
	         ans[1] = max;
	         break;
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
    int[] ans = findSmallestRange(matrix,col,row);
    System.out.println("The range is "+Arrays.toString(ans));
  }
}
