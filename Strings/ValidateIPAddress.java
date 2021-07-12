/**
 Program to validate IPV4 address
 Link : https://practice.geeksforgeeks.org/problems/validate-an-ip-address-1587115621/1
 Time Complexity : O(N)
 Space Complexity : O(1)
*/
import java.io.*;
import java.util.*;
public class ValidateIPAddress{

  public boolean isValid(String s) {
        // Write your code here
        String[] input = s.split("[.]");
        if(input.length!=4){
            // System.out.println("length mismatch is "+input.length);
            return false;
        }
        long count = s.chars().filter(each -> each == '.').count();
        if(count!=3){
            // System.out.println("dot mismatch");
            return false;
        }
        Set<String> set = new HashSet<>();
        for(int i=0;i<256;i++){
            set.add(String.valueOf(i));
        }
        for(String each : input){
            if(!set.contains(each)){
                // System.out.println("element mismatch");
                return false;
            }
        }
        return true;
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input IP address");
    String input = br.readLine();
    ValidateIPAddress validate = new ValidateIPAddress();
    System.out.println("The IPV4 address validity status "+validate.isValid(input));
  }
}
