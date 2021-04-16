import java.util.*;
import java.io.*;
public class CountPairSum{

  static int getPairCount(int[] array,int sum){
    HashMap<Integer,Integer> hashMap = new HashMap<>();
    int count = 0;
    for(int each : array){
      if(hashMap.containsKey(sum-each)){
        count++;
      }
      else{
        hashMap.put(each,1);
      }
    }
    return count;
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
    System.out.println("Enter the sum");
    Integer sum = Integer.valueOf(br.readLine());
    System.out.println("The count is "+getPairCount(array,sum));
  }
}
