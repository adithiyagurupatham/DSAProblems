/**
Program to swap kth node from begining and end
Link : https://practice.geeksforgeeks.org/problems/swap-kth-node-from-beginning-and-kth-node-from-end-in-a-singly-linked-list/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class NodeSwap
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

  static Node swapkthnode(Node head, int n, int k)
    {
        // your code here
        if(k>n)
        {
            return head;
        }
        if(n-k+1 == k){
            return head;
        }
        Node x = head,xPrev = null;
        for(int i=1;i<k;i++)
        {
            xPrev = x;
            x = x.next;
        }
        Node y = head,yPrev = null;
        for(int i=1;i<(n-k+1);i++){
            yPrev = y;
            y = y.next;
        }
        if(xPrev!=null){
            xPrev.next = y;
        }
        if(yPrev!=null){
            yPrev.next = x;
        }
        Node temp = x.next;
        x.next = y.next;
        y.next = temp;
        if(k==1){
            head = y;
        }
        if(k==n){
            head = x;
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
    head = swapkthnode(head,n,k);
    System.out.println("The link list is ");
    print(head);
    System.out.println();
  }
}
