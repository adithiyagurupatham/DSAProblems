/**
Program to swap the node in pair wise
Link : https://practice.geeksforgeeks.org/problems/pairwise-swap-of-nodes-in-linkelist/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class PairWiseSwapOptimal
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

  static Node pairwiseSwap(Node head)
    {
        if(head==null || head.next ==null){
            return head;
        }
        Node prev = head;
        Node curr = head.next.next;
        head = head.next;
        head.next = prev;
        while(curr!=null && curr.next!=null){
            prev.next = curr.next;
            Node temp = curr.next.next;
            curr.next.next = curr;
            prev = curr;
            curr = temp;
        }
        prev.next = curr;
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
    head = pairwiseSwap(head);
    System.out.println("The link list is ");
    print(head);
    System.out.println();
  }
}
