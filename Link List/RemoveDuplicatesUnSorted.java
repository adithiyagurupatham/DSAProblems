/**
Program to remove duplicates in unsorted link list
Link : https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1/
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;
class RemoveDuplicatesUnSorted
{
  private static class Node{
     Integer data;
     Node next;
    Node(int data)
    {
      this.data = data;
    }
  }

  static Node removeDuplicates(Node head)
    {
         Set<Integer> set = new HashSet<>();
         Node curr = head,prev =null;
         while(curr!=null){
             if(set.contains(curr.data)){
                 prev.next = curr.next;
             }
             else{
                 prev = curr;
                 set.add(curr.data);
             }
             curr = curr.next;
         }
         return head;
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
    head = removeDuplicates(head);
    System.out.println("The link list is ");
    print(head);
    System.out.println();
  }
}
