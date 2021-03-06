/**
Program to create and print link list in non static manner
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class LinkedListCreationNonStatic
{
  class Node{
    private Integer data;
    private Node next;
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

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the count of values");
    Integer n = Integer.valueOf(br.readLine());
    System.out.println("Enter the values");
    LinkedListCreationNonStatic list = new LinkedListCreationNonStatic();
    int val = Integer.valueOf(br.readLine());
    Node head = list.new Node(val);
    Node temp = head;
    for(int i=0;i<n-1;i++)
    {
      val = Integer.valueOf(br.readLine());
      Node node = list.new Node(val);
      temp.next = node;
      temp = temp.next;
    }
    System.out.println("The link list is ");
    print(head);
    System.out.println();
  }
}
