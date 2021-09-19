/**
Program to find the winner of the election
Link : https://practice.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621/1/
Time Complexity : O(NlogN)
Space Complexity : O(N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Map;
import java.util.stream.Collectors;
public class ElectionWinner{

  static String[] winner(String arr[], int n)
    {
        // add your code
        Map<String,Integer> map = new TreeMap<>();
        for(String each : arr){
            map.merge(each,1,Integer::sum);
        }
        int max =0;
        String ans="";
        String[] temp = new String[2];
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
        temp[0] = ans;
        temp[1] = String.valueOf(max);
        return temp;

    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer size = Integer.valueOf(br.readLine());
    String[] array = new String[size];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = stringArray[i];
    }
    System.out.println("the winner of the election is "
          + Arrays.toString(winner(array, size)));

  }

}
