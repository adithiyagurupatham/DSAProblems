/**
Program to perform merge sort on the link list
Time Complexity : O(NlogN)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class MergeSort
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

  static Node getMiddle(Node node)
    {
        if(node==null)
        {
            return node;
        }
        Node fast = node.next,slow = node;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static Node merge(Node a ,Node b){
        if(a==null)
        {
            return b;
        }
        if(b==null)
        {
            return a;
        }
        Node temp = new Node(-1);
        Node ans = temp;
        while(a!=null && b!=null)
        {
            if(a.data<b.data)
            {
                temp.next = a;
                a = a.next;
            }
            else
            {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }
        temp.next = (a==null)?b:a;
        return ans.next;
    }



    static Node mergeSort(Node head)
    {
        // add your code here
        if(head==null || head.next ==null)
        {
            return head;
        }
        Node firstHalf = getMiddle(head);
        Node secondHalf = firstHalf.next;
        firstHalf.next = null;
        return merge(mergeSort(head),mergeSort(secondHalf));

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
    head = mergeSort(head);
    System.out.println("The sorted link list is ");
    print(head);
    System.out.println();
  }
}
