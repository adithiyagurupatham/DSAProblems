import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class UnsortedSumPairNormal{
  static boolean doesPairExist(int[] array,int value){
    for(int i=0;i<array.length;i++){
      for(int j=i+1;j<array.length;j++){
        if(array[i]+array[j]==value){
          return true;
        }
      }
    }
    return false;
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
    System.out.println("Enter the sum which need to be checked");
    Integer sum = Integer.valueOf(br.readLine());
    System.out.println("The sum pair status is "+doesPairExist(array,sum));
  }
}
