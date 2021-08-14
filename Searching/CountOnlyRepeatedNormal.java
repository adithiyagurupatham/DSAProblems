/**
Program to return the repetitive element and its count in the consecutive sorted array
Link : https://practice.geeksforgeeks.org/problems/count-only-repeated2047/1
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.awt.Point;
import java.util.Set;
import java.util.HashSet;
public class CountOnlyRepeatedNormal{

  static Point findRepeating(int arr[],int n)
    {
        Set<Integer> set = new HashSet<>();
        int counter=0,element=-1;
        for(int each : arr){
            if(set.contains(each)){
                element = each;
                counter++;
            }
            else{
                set.add(each);
            }
        }
        if(element==-1){
            counter=-1;
        }
        return new Point(element,counter+1);

    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the fir input size");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      array[i] = Integer.valueOf(inputString[i]);
    }
    Point point = findRepeating(array,size);
    System.out.println("The repetitive element is "+point.x+" and the repetitive count is  "+point.y);
  }
}
