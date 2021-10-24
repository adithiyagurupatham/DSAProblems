/**
Program to reverse the queue
Link : https://practice.geeksforgeeks.org/problems/queue-reversal/1/
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class ReverseQueueRecursive{
  static  Queue<Integer> rev(Queue<Integer> q){
    if(q.isEmpty()){
       return q;
   }
   int x = q.poll();
   rev(q);
   q.offer(x);
   return q;
  }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the elements");
    String[] input = br.readLine().split(" ");
    Queue<Integer> queue = new ArrayDeque<>();
    for(String each : input){
      queue.offer(Integer.valueOf(each));
    }
    System.out.println("The answer is "+rev(queue));
  }
}
