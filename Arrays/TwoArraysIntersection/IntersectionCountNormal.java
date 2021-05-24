/**
 Program to find the intersection count of two arrays
 Link : https://practice.geeksforgeeks.org/problems/intersection-of-two-arrays2404
 Time Complexity : O(mLogm+nLogn)
*/
import java.io.*;
import java.util.*;
public class IntersectionCountNormal{

  static int getIntersectionCount(int[] firstArray,int[] secondArray){
    int i=0,j=0,ans=0;
    while(i<firstArray.length && j<secondArray.length){
      if(firstArray[i]<secondArray[j]){
        i++;
      }
      else if(firstArray[i]>secondArray[j]){
        j++;
      }
      else{
        ans++;
        i++;
        j++;
      }
    }
    return ans;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the first array size");
    Integer firstSize = Integer.valueOf(br.readLine());
    System.out.println("Enter the second array size");
    Integer secondSize = Integer.valueOf(br.readLine());
    int[] firstArray = new int[firstSize];
    int[] secondArray = new int[secondSize];
    System.out.println("Enter the first array elements");
    String[] firstArrayString = br.readLine().split(" ");
    System.out.println("Enter the second array elements");
    String[] secondArrayString = br.readLine().split(" ");
    for(int i=0;i<firstSize;i++){
      firstArray[i] = Integer.valueOf(firstArrayString[i]);
    }
    for(int i=0;i<secondSize;i++){
      secondArray[i] = Integer.valueOf(secondArrayString[i]);
    }
    Arrays.sort(firstArray);
    Arrays.sort(secondArray);
    System.out.println("The intersection count is "+getIntersectionCount(firstArray,secondArray));
  }
}
