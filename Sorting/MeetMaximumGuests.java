/**
Program to meet maximum guests at a time
Link : https://www.geeksforgeeks.org/find-the-point-where-maximum-intervals-overlap/
Time Complexity : O(NlogN)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.lang.Math;
public class MeetMaximumGuests{

  static int findMaximumGuestMeetTime(int[] arrival,int[] departure){
    Arrays.sort(arrival);
    Arrays.sort(departure);
    int i=1,j=0,curr=1,res=1;
    while(i<arrival.length && j<departure.length){
      if(arrival[i]<=departure[j]){
        curr++;
        i++;
      }
      else{
        curr--;
        j++;
      }
      res = Math.max(res,curr);
    }
    return res;
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
