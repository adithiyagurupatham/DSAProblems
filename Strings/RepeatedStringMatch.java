/**
Program to find the count of repetition needed to make B as the subString of A
Link : https://practice.geeksforgeeks.org/problems/0cba668df04d657fde4d1bd28b626a01e61097f1/1#
Time Complexity : O(m*n)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
public class RepeatedStringMatch{
  static int repeatedStringMatch(String A, String B)
	{
        StringBuilder sb = new StringBuilder(A);
        int copies=1;
        while(sb.length()<B.length()){
            sb.append(A);
            copies++;
        }
        if(sb.indexOf(B)>=0){
            return copies;
        }
        sb.append(A);
        copies++;
        if(sb.indexOf(B)>=0){
            return copies;
        }
        return -1;
	}

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the original text");
      String str = br.readLine();
      System.out.println("Enter the subString text");
      String subString = br.readLine();
      System.out.println("The repetition count is  "+repeatedStringMatch(str,subString));
  }

}
