/**
Program to meet maximum guests at a time
Link : https://www.geeksforgeeks.org/find-the-point-where-maximum-intervals-overlap/
Time Complexity : O(Max(departure))
Space Complexity : O(Max(departure))
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.lang.Math;
public class MeetMaximumGuestsOptimal{

  static int findMaximumGuestMeetTime(int[] arrival,int[] departure){
    int maxa = Arrays.stream(arrival).max().getAsInt();
    int maxd = Arrays.stream(departure).max().getAsInt();
    int max = Integer.max(maxa,maxd);
    int[] aux = new int[max+2];
    for(int i=0;i<arrival.length;i++){
      ++aux[arrival[i]];
      --aux[departure[i]+1];
    }
    int ans = Integer.MIN_VALUE,curr=0;
    for(int i=0;i<aux.length;i++){
      curr+=aux[i];
      ans = Math.max(curr,ans);
    }
    return ans;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the arrival size");
    Integer size = Integer.valueOf(br.readLine());
    int[] arrival = new int[size];
    System.out.println("Enter the arrival timings");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<size;i++){
      arrival[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("Enter the departure size");
    Integer size1 = Integer.valueOf(br.readLine());
    int[] departure = new int[size1];
    System.out.println("Enter the departure timings");
    inputString = br.readLine().split(" ");
    for(int i=0;i<size1;i++){
      departure[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println(findMaximumGuestMeetTime(arrival, departure));
  }
}
