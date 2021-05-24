/**
 Program to find the intersection count of two arrays
 Link : https://practice.geeksforgeeks.org/problems/intersection-of-two-arrays2404
 Time Complexity : O(m+n)
*/
import java.io.*;
import java.util.*;
public class IntersectionCountOptimal{

  static int NumberofElementsInIntersection(int a[],int b[],int n,int m)
    {
        int ans=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int each : a){
            map.put(each,1);
        }
        for(int each : b){
            if(map.containsKey(each)){
                map.put(each,map.get(each)-1);
            }
        }
        for(Integer each : map.values()){
            if(each<=0){
                ans++;
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
    System.out.println("The intersection count is "+NumberofElementsInIntersection(firstArray,secondArray,firstSize,secondSize));
  }
}
