/**
Program to reverse the k elements of the  queue
Link : https://practice.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1
Time Complexity : O(N)
Space Complexity : O(K)
*/
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class ReverseKelements{
  static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0;i<k && !q.isEmpty();i++){
            stack.push(q.poll());
        }
        while(!stack.isEmpty()){
            q.offer(stack.pop());
        }
        for(int i=0;i<(q.size()-k);i++){
            q.offer(q.poll());
        }
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
    System.out.println("Enter the value of k ");
    Integer k = Integer.valueOf(br.readLine());
    System.out.println("The answer is "+modifyQueue(queue,k));
  }
}
