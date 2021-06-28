/**
 Program to find the majority of the elements of array (occuring more than n/2 times)
 It assumes that there is one majority element present
 Link : https://leetcode.com/problems/majority-element/
*/
import java.io.*;
public class MooreVotingAlgorithm{
  static int getMajorityElement(int[] nums){
    int majority=nums[0],counter=1;
        for(int each : nums){
            if(each==majority){
                counter++;
            }
            else{
                counter--;
                if(counter<=0){
                    majority=each;
                    counter=1;
                }
            }
        }
        return majority;
  }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("The majority element is "+getMajorityElement(array));
  }
}
