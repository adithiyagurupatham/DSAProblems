/**
Program to perform push,pop in  O(1) time using array
Link : https://practice.geeksforgeeks.org/problems/implement-stack-using-array/1/
Time Complexity : O(1)
Space Complexity : O(1)
*/
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Stack;

class MyStack{
  int capacity,top;
  int[] arr;
  MyStack(int capacity){
    this.capacity = capacity;
    arr = new int[capacity];
    top=-1;
  }

  void push(int a)
	{
	    arr[++top] = a;
	}

  int pop()
	{
        if(isEmpty()){
            return -1;
        }
        int ans = arr[top--];
        return ans;
	}

  boolean isEmpty(){
	    return top==-1;
	}

  void print(){
    for(int i=0;i<=top;i++){
      System.out.print(arr[i]+" ");
    }
      System.out.println();
  }

}

public class ArrayStack{

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the capacity of the stack");
    Integer capacity =Integer.valueOf(br.readLine());
    MyStack stack = new MyStack(capacity);
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
