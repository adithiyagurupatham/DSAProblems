import java.util.*;
import java.io.*;
public class CountPairSumWithDuplicates{

  static int getPairCountWithDuplicates(int[] array,int sum){
    int counter =0;
    Map<Integer,Integer> hashMap = new HashMap<>();

    for(int each : array){
      if(hashMap.containsKey(sum-each)){
        counter +=hashMap.get(sum-each);
      }
      if(hashMap.containsKey(each)){
        hashMap.put(each,hashMap.get(each)+1);
      }
      else{
        hashMap.put(each,1);
      }
    }
    return counter;
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
    System.out.println("The pair count is "+getPairCountWithDuplicates(array,sum));
  }
}
