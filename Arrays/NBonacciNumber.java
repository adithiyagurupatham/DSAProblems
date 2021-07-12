/**
Program to print the n - bonacci series
Time Complexity : O(M)
Space Complexity : O(M)
*/
import java.io.*;
public class NBonacciNumber{
  static void bonacciseries(int n, int size)
	{
		int a[] = new int[size];
		for(int i = 0; i < size; i++)
			a[i] = 0;

		a[n - 1] = 1;
		a[n] = 1;

		// Uses sliding window
		for (int i = n + 1; i < size; i++)
			a[i] = 2 * a[i - 1] - a[i - n - 1];

		// Printing result
		for (int i = 0; i < size; i++)
			System.out.print(a[i] + " ");
	}

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the value of size");
    Integer size = Integer.valueOf(br.readLine());
    System.out.println("Enter the value of n");
    Integer n = Integer.valueOf(br.readLine());
    System.out.println("The n-Bonacci values are ");
    bonacciseries(n,size);
  }
}
