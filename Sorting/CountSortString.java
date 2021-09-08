/**
Program to sort the string in sorted order
Link : https://practice.geeksforgeeks.org/problems/counting-sort/1/
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class CountSortString{



  public static String countSort(String arr)
    {
        int[] count = new int[26];
        for(int i=0;i<arr.length();i++){
            count[arr.charAt(i)-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            for(int j=0;j<count[i];j++){
                char c = (char)('a'+i);
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the input");
      String inputString = br.readLine();
      System.out.println("After sorting the string is "+countSort(inputString));
    }
}
