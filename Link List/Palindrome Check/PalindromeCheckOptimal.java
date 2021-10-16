/**
Program to check if the given linkedlist is palindrome or not
Link : https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class PalindromeCheckOptimal
{
  private static class Node{
     Integer data;
     Node next;
    Node(int data)
    {
      this.data = data;
    }
  }

  static Node getMiddle(Node curr){
        Node slow=curr,fast=curr;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

  static Node reverse(Node mid){
        Node prev=null,curr=mid;
        while(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    static boolean isPalindrome(Node head)
    {
        Node mid = getMiddle(head);
        mid = reverse(mid);
        Node curr = head;
        while(mid!=null){
            if(mid.data!=curr.data){
                return false;
            }
            mid = mid.next;
            curr = curr.next;
        }
        return true;
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
    System.out.println("The link list palindrome status  is " + isPalindrome(head));
  }
}
