/**
Program to insert entry in sorted list
Link : https://practice.geeksforgeeks.org/problems/insert-in-a-sorted-list/1
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class SortedInsert
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

  static   Node sortedInsert(Node head, int key) {
        Node temp = new Node(key);
        Node curr = head,prev=null;
        while(curr!=null && curr.data<key)
        {
            prev = curr;
            curr = curr.next;
        }
        if(prev==null)
        {
           temp.next=head;
           return temp;
        }
        prev.next = temp;
        temp.next = curr;
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
    System.out.println("Enter the value to be inserted");
    Integer data = Integer.valueOf(br.readLine());
    head = sortedInsert(head, data);
    System.out.println("The link list is ");
    print(head);
    System.out.println();
  }
}
