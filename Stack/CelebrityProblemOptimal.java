/**
Program to find the celebrity
Time Complexity : O(N)
Space Complexity : O(N)
*/
import java.io.*;
import java.util.*;
public class CelebrityProblemOptimal{
  // static void print(int[][] array){
  //   for(int i=0;i<array.length;i++){
  //     for(int j=0;j<array[i].length;j++){
  //       System.out.print(array[i][j]+" ");
  //     }
  //     System.out.println();
  //   }
  // }
  int pushAgain(int M[][],int a,int b){
        if(M[a][b]==1){
            return b;
        }
        return a;
    }

    boolean isCelebrity(int M[][],int val){
        for(int i=0;i<M[val].length;i++){
            if(M[val][i]==1){
                return false;
            }
        }
        return true;
    }

    boolean isZero(int M[][]){
        for(int i=0;i<M.length;i++){
            for(int j=0;j<M[i].length;j++){
                if(M[i][j]==1){
                    return false;
                }
            }
        }
        return true;
    }

    int celebrity(int M[][], int n)
    {
    	if(isZero(M)){
    	    return -1;
    	}
    	Stack<Integer> stack = new Stack<>();
    	for(int i=0;i<n;i++){
    	    stack.push(i);
    	}
    	int count=1;
    	while(count<n){
    	    int a = stack.pop();
    	    int b = stack.pop();
    	    int ans = pushAgain(M,a,b);
    	    stack.push(ans);
    	    count++;
    	}
    	if(stack.isEmpty()){
    	    return -1;
    	}
    	int ans = stack.pop();
    	boolean fin =  isCelebrity(M,ans);
    	if(fin){
    	    return ans;
    	}
    	return -1;
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input size");
    Integer size = Integer.valueOf(br.readLine());
    int[][] array = new int[size][size];
    System.out.println("Enter the elements");
    for(int i=0;i<size;i++){
      String[] inputString = br.readLine().split(" ");
      for(int j=0;j<inputString.length;j++){
        array[i][j] = Integer.valueOf(inputString[j]);
      }
    }
    CelebrityProblemNormal celebrity = new CelebrityProblemNormal();
    System.out.println("The celebrity is "+celebrity.celebrity(array,size));
  }
}
