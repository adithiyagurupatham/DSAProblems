import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MinimumElementInSortedRotatedArrayNormal
{

  static int minNumber(int arr[])
    {
        int min = Integer.MAX_VALUE;
        for(int each : arr){
            if(each <min){
                min = each;
            }
        }
        return min;
    }

  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("The minimum element is "+minNumber(array));
  }
}
