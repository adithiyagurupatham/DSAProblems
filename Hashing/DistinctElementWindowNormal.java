/**
Program to find the count of distinct elements in window of size k
Link : https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1
Time Complexity : O((n-k)*k^2)
Space Complexity : O(1)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.lang.Math;
public class DistinctElementWindowNormal{

  static ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int x=0;x<=n-k;x++){
            int count=0;
            for(int y=0;y<k;y++){
                boolean flag = false;
                for(int z=0;z<y;z++){
                    if(arr[y+x]==arr[z+x]){
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    count++;
                }
            }
            ans.add(count);
        }
        return ans;

    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of elements");
    Integer size = Integer.valueOf(br.readLine());
    int[] array = new int[size];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array[i] = Integer.valueOf(stringArray[i]);
    }
    System.out.println("Enter the value of k");
    Integer k = Integer.valueOf(br.readLine());
    System.out.println("The distinct elements count are "
          + countDistinct(array,size,k));

  }

}
