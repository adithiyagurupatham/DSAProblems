/**
Program to find the majority element of the given array of size n (Occurs more than n/2 times)
Link : https://leetcode.com/problems/majority-element/
*/
import java.io.*;
public class MajorityElement{
  static int majorityElement(int[] nums) {
        int answer=0,max=nums[0];
        for(int each : nums){
            if(each>max){
                max = each;
            }
        }
        for(int i=0;i<32;i++){
            int counter=0;
            for(int each : nums){
                if(((1<<i) & each) !=0){
                    counter++;
                }
            }
            if(counter>(nums.length/2)){
                answer = (1<<i) | answer;
            }

        }
        return answer;
    }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer number = Integer.valueOf(br.readLine());
    System.out.println("Enter the elements");
    String[] input = br.readLine().split(" ");
    int[] array = new int[number];
    for(int i=0;i<number;i++){
      array[i] = Integer.valueOf(input[i]);
    }
    System.out.println("The majority element is "+majorityElement(array));
  }
}
