/**
Program to perform push,pop,min in O(1) time
Link : https://practice.geeksforgeeks.org/problems/get-minimum-element-from-stack/1#
Time Complexity : O(1)
Space Complexity : O(1)
*/
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Stack;

class SpecialStack{
  int minEle=Integer.MAX_VALUE;
    Stack<Integer> s;

    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	if(s==null || s.isEmpty()){
	    return -1;
	}
	return minEle;
    }

    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	if(s==null || s.isEmpty()){
	    return -1;
	}
	int x =  s.pop();
	if(x<minEle){
	    int temp = minEle;
	    minEle = (2*minEle)-x;
	    return temp;
	}
	return x;
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here
	if(s==null){
	    s = new Stack<>();
	}
	if(x<minEle){
	    s.push((2*x)-minEle);
	    minEle = x;
	    return;
	}
	s.push(x);
    }
}

public class MinStack{

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    SpecialStack stack = new SpecialStack();
    while(true){
      System.out.println("1.Push the element\n2.Pop the element\n3.Get minimum element\n4.exit");
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
            System.out.println("The minimum element is "+stack.getMin());
            break;
        case 4:
          return;
      }
    }
  }

}
