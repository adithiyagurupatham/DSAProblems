import java.io.*;
public class MaxRowsWithOnesBinarySearch{

  static int getOnesCount(int[][] arr,int rowNumber,int columns){
        int start=0;
        int end=columns-1,ans=-1;
        while(start<=end){
            int mid = start + ((end-start)/2);
            if(arr[rowNumber][mid]==1){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }

  static int rowWithMax1s(int arr[][], int n, int m) {
        int ans=-1,max=0;
        for(int i=0;i<n;i++){
            int val = getOnesCount(arr,i,m);
            if(val!=-1 && (m-val)>max){
                max=m-val;
                ans=i;
            }
        }
        return ans;
    }
  public static void main(String[] args) throws IOException{
    int rows,columns;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of rows");
    rows =Integer.valueOf(br.readLine());
    System.out.println("Enter the number of columns");
    columns =Integer.valueOf(br.readLine());
    int[][] array = new int[rows][columns];
    System.out.println("Enter the elements");
    String[] stringArray = br.readLine().split(" ");
    for(int i=0;i<rows;i++){
      for(int j=0;j<columns;j++){
        int value = (i*rows)+j;
        array[i][j] = Integer.valueOf(stringArray[value]);
      }
    }
    System.out.println("The row with max no. of 1's is "+rowWithMax1s(array,rows,columns));
  }

}
