/**
Program to create and print double link list in a static manner
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class DoubleLinkedListPositionDeletion
{
  private static class Node{
     Integer data;
     Node next;
     Node prev;
    Node(int data)
    {
      this.data = data;
    }
  }

  static Node deleteNode(Node head,int x)
    {
	int count=0;
	Node temp = head;
	if(x==1)
	{
	    return head.next;
	}
	while(temp!=null)
	{
	    count++;
	    if(count==x)
	    {
	        if(temp.next!=null)
	        {
	            temp.next.prev = temp.prev;
	        }
	        if(temp.prev!=null)
	        {
	            temp.prev.next = temp.next;
	        }
	        temp.next=null;
	        temp.prev=null;

	    }
	    temp = temp.next;
	}
	return head;
    }

  static void printFromHead(Node head)
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

  static void printFromTail(Node tail)
  {
    Node temp = tail;
    while(temp!=null)
    {
      System.out.print(temp.data);
      temp = temp.prev;
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
    for(int i=1;i<n;i++)
    {
      val = Integer.valueOf(br.readLine());
      Node node = new Node(val);
      node.prev = temp;
      temp.next = node;
      temp = temp.next;
    }
    System.out.println("Enter the position to be inserted");
    Integer pos = Integer.valueOf(br.readLine());
    head = deleteNode(head, pos);
    System.out.println("The link list from head is ");
    printFromHead(head);
    System.out.println();
    Node curr = head;
    while(curr.next!=null)
    {
      curr = curr.next;
    }
    System.out.println("The link list from tail is ");
    printFromTail(curr);
    System.out.println();
  }
}
