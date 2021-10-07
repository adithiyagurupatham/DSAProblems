/**
Program to find the nth node element from the end of the link list
Link : https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class NthFromEndNormal
{
  private static class Node{
     Integer data;
     Node next;
    Node(int data)
    {
      this.data = data;
    }
  }

  static void print(Node head)
  {
    Node temp = head;
    while(temp!=null)
    {
      System.out.print(temp.data);
      temp = temp.next;
      if(temp!=null)
      {
        System.out.print("->");
      }
    }
  }

  static  int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	int count =0;
    	Node curr = head;
    	while(curr!=null)
    	{
    	    count++;
    	    curr = curr.next;
    	}
    	if(count<n)
    	    return -1;
    	curr = head;
    	for(int i=0;i<count-n;i++)
    	{
    	    curr = curr.next;
    	}
    	return curr.data;
    }


  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the count of values");
    Integer n = Integer.valueOf(br.readLine());
    System.out.println("Enter the values");
    int val = Integer.valueOf(br.readLine());
    Node head = new Node(val);
    Node temp = head;
    for(int i=0;i<n-1;i++)
    {
      val = Integer.valueOf(br.readLine());
      Node node = new Node(val);
      temp.next = node;
      temp = temp.next;
    }
    System.out.println("Enter the position");
    Integer pos = Integer.valueOf(br.readLine());
    System.out.println("The element from end of list is "+getNthFromLast(head,pos));
  }
}
