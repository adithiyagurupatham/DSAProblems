/**
Program to create and print link list in a static manner
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class IterativeSearch
{
  private static class Node{
     Integer data;
     Node next;
    Node(int data)
    {
      this.data = data;
    }
  }

  static int find(Node head,int x)
  {
    if(head==null)
    {
      return -1;
    }
    if(head.data==x)
    {
      return 1;
    }
    int res = find(head.next,x);
    if(res==-1)
    {
      return -1;
    }
    return ++res;

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
    System.out.println("Enter the value to be searched");
    int x = Integer.valueOf(br.readLine());
    System.out.println("The position is " +find(head,x));
  }
}
