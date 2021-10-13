/**
Program to swap kth node from begining and end
Link : https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class GroupListReversal
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

  static Node reverse(Node head, int k)
    {
        //Your code here
        Node curr = head,prevFirst = null;
        int count=0;
        boolean isFirst = true;
        while(curr!=null){
            Node first = curr,prev=null;
            count=0;
            while(curr!=null && count<k){
                Node temp = curr.next;
                curr.next = prev;
                prev=curr;
                curr = temp;
                count++;
            }
            if(isFirst){
                 isFirst = false;
                 head=prev;
            }
            else{
                prevFirst.next = prev;
            }
            prevFirst = first;
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
    System.out.println("Enter the value of k ");
    Integer k = Integer.valueOf(br.readLine());
    head = reverse(head,k);
    System.out.println("The link list is ");
    print(head);
    System.out.println();
  }
}
