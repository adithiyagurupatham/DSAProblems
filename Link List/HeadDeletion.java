/**
Program to delete the node at the head of the linked list
Time Complexity : O(1)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class HeadDeletion
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

  static Node deleteAtBeginning(Node head)
    {
        if(head==null)
        {
          return head;
        }
        return head.next;
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
    head = deleteAtBeginning(head);
    System.out.println("The link list is ");
    print(head);
    System.out.println();
  }
}
