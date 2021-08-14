/**
Program to return the repetitive element and its count in the consecutive sorted array
Link : https://practice.geeksforgeeks.org/problems/count-only-repeated2047/1
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.awt.Point;
public class CountOnlyRepeatedOptimal{

  static Point findRepeating(int arr[],int n)
    {
        boolean isRepetitive=false;
        int repetitiveCount=1,repetitiveElement=-1;
        for(int i=1;i<n;i++){
            if(arr[i]-arr[i-1]==0){
                isRepetitive=true;
                repetitiveCount++;
                repetitiveElement=arr[i];
            }
        }
        if(!isRepetitive){
            return new Point(-1,-1);
        }
        return new Point(repetitiveElement,repetitiveCount);

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
    Point point = findRepeating(array,size);
    System.out.println("The repetitive element is "+point.x+" and the repetitive count is  "+point.y);
  }
}
