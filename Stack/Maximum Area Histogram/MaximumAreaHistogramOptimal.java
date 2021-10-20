/**
Program to find the maximum area of the histogram
Link : https://practice.geeksforgeeks.org/problems/maximum-rectangular-area-in-a-histogram-1587115620/1/
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;
public class MaximumAreaHistogramOptimal{

  static long getMaxArea(long hist[], int n)
    {
      long ans=0;
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

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer number = Integer.valueOf(br.readLine());
    long[] array = new long[number];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Long.valueOf(stringArray[i]);
    }
    System.out.println("The maximum area is "+getMaxArea(array,number));
  }
}
