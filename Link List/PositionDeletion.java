/**
Program to delete the node at the given position of the linked list
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class PositionDeletion
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

  static Node deleteNode(Node head, int x)
    {
	if(head==null)
	{
	    return null;
	}
	if(x==1)
	{
	    return head.next;
	}
	int count=0;
	Node curr=head,prev=null;
	while(curr!=null){
	    count++;
	    if(count==x)
	    {
	        prev.next = curr.next;
	        break;
	    }
	    prev=curr;
	    curr = curr.next;
	}
	return head;
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
    System.out.println("Enter the position to be deleted");
    int x = Integer.valueOf(br.readLine());
    head = deleteNode(head,x);
    System.out.println("The link list is ");
    print(head);
    System.out.println();
  }
}
