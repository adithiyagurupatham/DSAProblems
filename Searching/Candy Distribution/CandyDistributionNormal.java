/**
Program to distribute N candies to K children in increasing consecutive manner
Link : https://practice.geeksforgeeks.org/problems/distribute-n-candies/1
Time Complexity : O(N)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class CandyDistributionNormal{

  static Long[] distributeCandies(int N, int K) {
        Long[] answer = new Long[K];
        for(int i=0;i<K;i++){
            answer[i]=0L;
        }
        int candiesGiven=0,candiesAvailable=N;
        for(int i=0,candies=0;i<K;i=(i+1)%K){
            candies++;
            candiesGiven+=candies;
            if(candiesGiven<=candiesAvailable){
                answer[i]+=candies;
            }
            else{
                answer[i]+=(candiesAvailable-(candiesGiven-candies));
                break;
            }

        }
        return answer;
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the candies count");
    Integer n = Integer.valueOf(br.readLine());
    System.out.println("Enter the kids count");
    Integer k = Integer.valueOf(br.readLine());
    Long[] answer = distributeCandies(n,k);
    System.out.println("The candies given are ");
    for(Long each : answer){
      System.out.print(each+" ");
    }
    System.out.println();
  }
}
