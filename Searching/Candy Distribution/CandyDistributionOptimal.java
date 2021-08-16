/**
Program to distribute N candies to K children in increasing consecutive manner
Link : https://practice.geeksforgeeks.org/problems/distribute-n-candies/1
Time Complexity : O(logN + K)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class CandyDistributionOptimal{

  static Long[] distributeCandies(int N, int k) {
    Long n = new Long(N);
    Long[] answer = new Long[k];
    for(int i=0;i<k;i++){
        answer[i]=0L;
    }
    long low = 0,high = n,count=0;
    while(low<=high){
        long mid = low+((high-low)/2);
        long midSum = (mid*(mid+1))/2;
        if(midSum<=n){
            low=mid+1;
            count = mid/k;
        }
        else{
            high = mid-1;
        }
    }
    long totalTerms = k*count;
    long givenCandies = (totalTerms * (totalTerms+1))/2;
    n-=givenCandies;
    long term = totalTerms+1;
    int j=0;
    while(n>0){
        if(term<=n){
           answer[j++]+=term;
           n-=term;
           term++;
        }
        else{
            answer[j]+=n;
            n=0L;
        }
    }
    for(int i=0;i<k;i++){
        answer[i]+= ((i+1)*count) + ((count*(count-1)*k)/2);
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
