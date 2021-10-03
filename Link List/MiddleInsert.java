/**
Program to insert the node in the middle of the link list
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class MiddleInsert
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

  static Node insertInMid(Node head, int data){

        Node temp = head;
        Node slow = head,fast=head,prev=null;
        Node node = new Node(data);
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        if(fast==null)
        {
           prev.next = node;
           node.next=slow;
        }
        else
        {
            Node ptr = slow.next;
            slow.next = node;
            node.next = ptr;

        }
        return head;
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the count of values");
    Integer n = Integer.valueOf(br.readLine());
    System.out.println("Enter the values");
    LinkedListCreationNonStatic list = new LinkedListCreationNonStatic();
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
    System.out.println("Enter the data to be inserted");
    Integer data = Integer.valueOf(br.readLine());
    insertInMid(head,data);
    System.out.println("The link list is ");
    print(head);
    System.out.println();
  }
}
