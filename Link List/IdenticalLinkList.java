/**
Program to check if the given link lists are identical or not
Time Complexity : O(M+N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class IdenticalLinkList
{
  private static class Node{
     Integer data;
     Node next;
    Node(int data)
    {
      this.data = data;
    }
  }

  static boolean isIdentical (Node head1, Node head2){
        Node temp1 = head1,temp2 = head2;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.data!=temp2.data)
            {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if(temp1!=null || temp2!=null)
        {
            return false;
        }
        return true;
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the count of first link list values");
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
    System.out.println("Enter the count of second link list values");
    Integer m = Integer.valueOf(br.readLine());
    System.out.println("Enter the values");
    int val1 = Integer.valueOf(br.readLine());
    Node head1 = new Node(val1);
    Node temp1 = head1;
    for(int i=0;i<m-1;i++)
    {
      val1 = Integer.valueOf(br.readLine());
      Node node = new Node(val1);
      temp1.next = node;
      temp1 = temp1.next;
    }

    System.out.println("The link list identical status is  "+isIdentical(head, head1));
  }
}
