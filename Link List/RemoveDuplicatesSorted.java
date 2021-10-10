/**
Program to remove duplicates in sorted link list
Link : https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class RemoveDuplicatesSorted
{
  private static class Node{
     Integer data;
     Node next;
    Node(int data)
    {
      this.data = data;
    }
  }

  static Node removeDuplicates(Node head)
    {
	if(head==null)
	{
	    return head;
	}
	Node curr = head;
	while(curr!=null && curr.next!=null)
	{
	    if(curr.data==curr.next.data)
	    {
	        curr.next = curr.next.next;
	    }
	    else
	    {
	        curr = curr.next;
	    }
	}
	return head;
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
    head = removeDuplicates(head);
    System.out.println("The link list is ");
    print(head);
    System.out.println();
  }
}
