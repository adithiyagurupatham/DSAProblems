/**
Program to segregate even and odd nodes in the link list
Link : https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class EvenOddSegregation
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

  static Node divide(Node head){
        Node curr = head;
        Node oHead = new Node(-1);
        Node eHead = new Node(-1);
        Node oTemp = oHead,eTemp = eHead;
        while(curr!=null){
            if(curr.data%2==0){
                eTemp.next = curr;
                eTemp = eTemp.next;
            }
            else{
                oTemp.next = curr;
                oTemp = oTemp.next;
            }
            curr = curr.next;
        }
        oTemp.next = null;
        eTemp.next = oHead.next;
        return eHead.next;

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
    head = divide(head);
    System.out.println("The link list is ");
    print(head);
    System.out.println();
  }
}
