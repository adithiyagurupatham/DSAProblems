/**
Program to find out the maximum number of cuts on rope
Link : https://www.geeksforgeeks.org/maximise-number-of-cuts-in-a-rod-if-it-can-be-cut-only-in-given-3-sizes/
*/
import java.io.*;
import java.lang.*;
public class MaximumRopeCut{
  static int getMaxCut(int size,int firstCut,int secondCut,int thirdCut){
    if(size==0){
      return 0;
    }
    if(size<0){
      return -1;
    }
    int ans = Math.max(getMaxCut(size-firstCut,firstCut,secondCut,thirdCut),
          Math.max(getMaxCut(size-secondCut,firstCut,secondCut,thirdCut),
          getMaxCut(size-thirdCut,firstCut,secondCut,thirdCut)));
    if(ans!=-1){
      return ans+1;
    }
    return -1;

  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the rod length");
    Integer size=Integer.valueOf(br.readLine());
    System.out.println("Enter the first rod cut size");
    Integer firstCut=Integer.valueOf(br.readLine());
    System.out.println("Enter the second rod cut size");
    Integer secondCut=Integer.valueOf(br.readLine());
    System.out.println("Enter the third rod cut size");
    Integer thirdCut=Integer.valueOf(br.readLine());
    System.out.println("The maximum rope cuts is "+getMaxCut(size,firstCut,secondCut,thirdCut));
  }

}
