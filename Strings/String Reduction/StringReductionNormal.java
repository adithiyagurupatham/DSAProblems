/**
Program to reduce string by removing k identical consecutive elements
Link : https://www.geeksforgeeks.org/reduce-the-string-by-removing-k-consecutive-identical-characters/
Complexity : O(S^2)
*/
import java.io.*;
import java.util.*;
public class StringReductionNormal{

  static String reduce(String s,int k){
        if(s.length()==0){
            return s;
        }
        int[] arr = new int[s.length()];
        Arrays.fill(arr,0);
        arr[0]=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                arr[i] = arr[i-1]+1;
                if(arr[i]==k){
                    int temp = i-k;
                    while(temp<i){
                        arr[++temp]=0;
                    }
                }
            }
            else{
                arr[i]=1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

  static String reduced_String(int k, String s)
    {
        String original=s,updated=s;
        if(k==1){
            return "";
        }
        while(true){
            updated = reduce(original,k);
            if(updated.length() == original.length()){
                return updated;
            }
            original=updated;
        }


    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input string");
    String input = br.readLine();
    System.out.println("Enter the value of  k");
    Integer k= Integer.valueOf(br.readLine());
    System.out.println("The reduced string is "+reduced_String(k,input));

  }
}
