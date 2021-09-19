/**
Program to sort one array based on the another array
Link : https://practice.geeksforgeeks.org/problems/relative-sorting4323/1/
Time Complexity : O(N*logN)
Space Complexity : O(N)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.Arrays;
import java.util.Collections;
public class SortOneByAnother{

  static int[] sortA1ByA2(int arr[], int m, int brr[], int n)
    {
        Map<Integer,Integer> map = new HashMap<>();
        Integer[] temp = Arrays.stream(brr).boxed().toArray(Integer[] :: new);
        Set<Integer> set = new HashSet<>(Arrays.asList(temp));
        ArrayList<Integer> list = new ArrayList<>();
        for(int each : arr)
        {
            map.merge(each,1,Integer :: sum);
            if(!set.contains(each)){
                list.add(each);
            }
        }
        Collections.sort(list);
        int i=0;
        for(int k=0;k<n;k++){
            if(map.containsKey(brr[k])){
                int c = map.get(brr[k]);
                for(int j=0;j<c;j++){
                    arr[i++] = brr[k];
                }
            }
        }
        for(Integer each : list){
            arr[i++] = each;
        }
            return arr;
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
    System.out.println("Enter the number of elements for second array");
    Integer size1 = Integer.valueOf(br.readLine());
    int[] array1 = new int[size1];
    System.out.println("Enter the second array elements");
    stringArray = br.readLine().split(" ");
    for(int i=0;i<stringArray.length;i++){
      array1[i] = Integer.valueOf(stringArray[i]);
    }
    System.out.println("the final sorted array is  "
          +Arrays.toString(sortA1ByA2(array,size,array1,size1)));
  }

}
