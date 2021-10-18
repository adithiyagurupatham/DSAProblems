/**
Program to perform push,pop in  O(1) time using link list
Link : https://practice.geeksforgeeks.org/problems/implement-stack-using-linked-list/1/
Time Complexity : O(1)
Space Complexity : O(1)
*/
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Stack;

class MyStack{

  private class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }

  Node top;

  void push(int a)
    {
        // Add your code here
        Node node = new Node(a);
        node.next = top;
        top=node;
    }

    int pop()
      {
          if(top==null){
              return -1;
          }
          int ans = top.data;
          top = top.next;
          return ans;
      }

  boolean isEmpty(){
	    return top==null;
	}

  void print(){
    Node curr = top;
    while(curr!=null){
      System.out.print(curr.data+" ");
      curr = curr.next;
    }
      System.out.println();
  }

}

public class LinkListStack{

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    MyStack stack = new MyStack();
    while(true){
      System.out.println("1.Push the element\n2.Pop the element\n3.Print all elements\n4.exit");
      Integer k =Integer.valueOf(br.readLine());
      switch(k){
        case 1:
            System.out.println("Enter the element to be pushed");
            Integer element =Integer.valueOf(br.readLine());
            stack.push(element);
            break;
        case 2:
            System.out.println("The popped element is "+stack.pop());
            break;
        case 3:
            System.out.println("The  elements are ");
            stack.print();
            break;
        case 4:
          return;
      }
    }
  }

}
