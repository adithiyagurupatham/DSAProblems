/**
Program to find the celebrity
Time Complexity : O(N^2)
Space Complexity : O(1)
*/
import java.io.*;
public class CelebrityProblemNormal{
  // static void print(int[][] array){
  //   for(int i=0;i<array.length;i++){
  //     for(int j=0;j<array[i].length;j++){
  //       System.out.print(array[i][j]+" ");
  //     }
  //     System.out.println();
  //   }
  // }
  boolean iSCompleteZero(int row,int[][]M){
        for(int i=0;i<M[row].length;i++){
            if(M[row][i]==1){
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
    	for(int i=0;i<M.length;i++){
    	    if(iSCompleteZero(i,M)){
    	        return i;
    	    }
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
