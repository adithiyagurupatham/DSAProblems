/**
Program to sort the stack in descending order
Link : https://practice.geeksforgeeks.org/problems/sort-a-stack/1
Time Complexity : O(N^2)
Space Complexity : O(N)
*/
import java.util.Scanner;
import java.util.Stack;
public class StackSort{

  static Stack<Integer> sort(Stack<Integer> s)
	{
		Stack<Integer> s2 = new Stack<>();
		while(!s.isEmpty())
		{
		    int temp = s.pop();
		    while(!s2.isEmpty() && s2.peek()<=temp)
		    {
		        s.push(s2.pop());
		    }
		    s2.push(temp);
		}
		while(!s2.isEmpty())
		{
		    s.push(s2.pop());
		}
		return s;
	}

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Stack<Integer> s=new Stack<>();
    System.out.println("Enter the number of values");
    int n=sc.nextInt();
    System.out.println("Enter the  values");
		while(n-->0){
      s.push(sc.nextInt());
    }
    Stack<Integer> a= sort(s);
    System.out.println("After sorting the  values are");
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
  }

}
