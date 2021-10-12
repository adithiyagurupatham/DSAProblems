/**
Program to merge two sorted link list
Link : https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1/
Time Complexity : O(M+N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class MergeTwoSortedList
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

  static Node sortedMerge(Node head1, Node head2) {
     Node temp = new Node(-1);
     Node ans = temp;
     while(head1!=null && head2!=null)
     {
         if(head1.data<head2.data)
         {
             temp.next = head1;
             head1 = head1.next;
         }
         else
         {
             temp.next = head2;
             head2 = head2.next;
         }
         temp = temp.next;
     }
     temp.next = (head1==null)?head2:head1;
     return ans.next;
   }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the count of first values");
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
    System.out.println("Enter the count of second values");
    Integer m = Integer.valueOf(br.readLine());
    System.out.println("Enter the values");
    val = Integer.valueOf(br.readLine());
    Node head1 = new Node(val);
    Node temp1 = head1;
    for(int i=0;i<m-1;i++)
    {
      val = Integer.valueOf(br.readLine());
      Node node = new Node(val);
      temp1.next = node;
      temp1 = temp1.next;
    }
    head = sortedMerge(head, head1);
    System.out.println("The link list is ");
    print(head);
    System.out.println();
  }
}
