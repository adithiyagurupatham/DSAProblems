import java.util.*;
import java.io.*;

public class leapYearDetector {
  public static void main(String args[]) throws Exception {

    //write your code here
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Integer inputSize = Integer.parseInt(br.readLine());
    for(int i=0;i<inputSize;i++){
      Integer year = Integer.parseInt(br.readLine());
      if(year%4==0){
        if((year%100==0) && (year%400!=0)){
            System.out.println(year + "is not a leap year");
            continue;
        }
        System.out.println(year + "is  a leap year");
      }
      else{
      System.out.println(year + "is not a leap year");
      }

    }

  }
}
