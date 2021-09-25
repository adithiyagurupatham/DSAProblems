/**
Program to check if the string is rotated by two places
Link : https://practice.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/1/
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class StringRotatedByTwoPlaces{

  static boolean isRotated(String str1, String str2)
    {
        if(str1.length()!=str2.length()){
            return false;
        }
        if(str1.length()<=2){
            return str1.equals(str2);
        }
        StringBuilder sb  = new StringBuilder(str1.substring(2));
        sb.append(str1.charAt(0));
        sb.append(str1.charAt(1));
        String anti = sb.toString();
        boolean isAnti = anti.equals(str2);
        sb = new StringBuilder(str1);
        sb.setLength(str1.length()-2);
        sb.insert(0,str1.charAt(str1.length()-2));
        sb.insert(1,str1.charAt(str1.length()-1));
        String clock = sb.toString();
        boolean isClock = clock.equals(str2);
        return isClock || isAnti;
    }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the first text");
      String firString = br.readLine();
      System.out.println("Enter the second text");
      String secString = br.readLine();
      System.out.println("The two places rotation status is "+isRotated(firString, secString));
  }

}
