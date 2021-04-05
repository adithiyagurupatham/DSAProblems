import java.util.*;
import java.io.*;
import java.lang.*;

public class ReverseDigitsOverflow {
  public static void main(String args[]) throws IOException {


    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Integer input = Integer.valueOf(br.readLine());
    System.out.println(reverseDigits(input));
  }

  static Integer reverseDigits(Integer num){
    int rev=0,prev_rev=0,curr=0;
        boolean negative = false;
        negative = (num<0)?true:false;
        if(negative){
            num = -num;
        }
        while(num>0){
            curr = num%10;
            rev = (rev*10)+curr;
            if((rev-curr)/10 !=prev_rev){
                return 0;
            }
            prev_rev=rev;
            num = num/10;
        }
        rev=(negative)?-rev:rev;
        return rev;
  }

}
