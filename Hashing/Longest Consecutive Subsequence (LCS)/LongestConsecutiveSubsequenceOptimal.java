/**
Program to find the longest consecutive subsequence
Link : https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1/
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
public class LongestConsecutiveSubsequenceOptimal{

  static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   int curr=0,ans=1;
	   Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[] :: new);
	   Set<Integer> set = new HashSet<>(Arrays.asList(temp));
	   int min = Arrays.stream(arr).min().getAsInt();
	   int max = Arrays.stream(arr).max().getAsInt();
	   for(int i=min;i<=max;i++){
	       if(set.contains(i)){
	           curr++;
	           ans = Math.max(ans,curr);
	       }
	       else{
	           curr=0;
	       }
	   }
	   return ans;

	}

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Integer.valueOf(stringArray[i]);
    }
    System.out.println("The longest consecutive subsequence is "
          + findLongestConseqSubseq(array, size));

  }

}
