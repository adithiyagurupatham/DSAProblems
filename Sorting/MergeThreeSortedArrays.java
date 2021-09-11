/**
Program to merge three sorted arrays
Time Complexity : O(l+m+n)
Space Complexity : O(1)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class MergeThreeSortedArrays{

  static void mergeTwo(ArrayList<Integer> ans,int[] first,int i,int[] second,int j){
        while(i<first.length && j<second.length){
            if(first[i]<=second[j]){
                ans.add(first[i]);
                i++;
            }
            else{
                ans.add(second[j]);
                j++;
            }
        }
        while(i<first.length){
            ans.add(first[i]);
            i++;
        }
        while(j<second.length){
            ans.add(second[j]);
            j++;
        }

    }

  static ArrayList<Integer> merge3sorted(int A[], int B[], int C[])
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0,j=0,k=0;
        while(i<A.length && j<B.length && k<C.length){
            if(A[i]<=B[j] && A[i]<=C[k]){
                ans.add(A[i]);
                i++;
            }
            else if(B[j]<=A[i] && B[j]<=C[k]){
                ans.add(B[j]);
                j++;
            }
            else{
                ans.add(C[k]);
                k++;
            }
        }
        if(i==A.length){
            mergeTwo(ans,B,j,C,k);
        }
        if(j==B.length){
            mergeTwo(ans,A,i,C,k);
        }
        if(k==C.length){
            mergeTwo(ans,A,i,B,j);
        }
        return ans;
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input size");
    Integer l = Integer.valueOf(br.readLine());
    int[] A = new int[l];
    System.out.println("Enter the elements");
    String[] inputString = br.readLine().split(" ");
    for(int i=0;i<l;i++){
      A[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("Enter the second array input size");
    Integer m = Integer.valueOf(br.readLine());
    int[] B = new int[m];
    System.out.println("Enter the elements");
    inputString = br.readLine().split(" ");
    for(int i=0;i<m;i++){
      B[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println("Enter the second array input size");
    Integer n = Integer.valueOf(br.readLine());
    int[] C = new int[n];
    System.out.println("Enter the elements");
    inputString = br.readLine().split(" ");
    for(int i=0;i<n;i++){
      C[i] = Integer.valueOf(inputString[i]);
    }
    System.out.println(merge3sorted(A,B,C));
  }
}
