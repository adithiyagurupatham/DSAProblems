/*
   Program to swap the odd and even bits of the given number
   Link : https://practice.geeksforgeeks.org/problems/swap-all-odd-and-even-bits-1587115621/1
   Time Complexity : O(1)
   Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class SwapOddEvenBits{
   static int swapBits(int n)
    {
	    int evenVal = n & 0xAAAAAAAA;
	    evenVal>>=1;
	    int oddVal = n&0x55555555;
	    oddVal<<=1;
	    return evenVal | oddVal;
	}
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the  number");
    Integer val = Integer.valueOf(br.readLine());
    System.out.println("The swapped value is "+swapBits(val));
  }
}
