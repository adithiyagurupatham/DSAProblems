/**
Program to find the distince element count in the given array
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;
public class DistinctElementCountOptimal{

  static int getDistinctCount(Integer[] array,int n){
    Collection<Integer> ans = Arrays.stream(array).filter(Objects::nonNull).collect(Collectors.toSet());
    return ans.size();
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer size = Integer.valueOf(br.readLine());
    Integer[] array = new Integer[size];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Integer.valueOf(stringArray[i]);
    }
    System.out.println("The distinct element count is "+getDistinctCount(array, size));

  }

}
