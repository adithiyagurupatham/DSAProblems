/**
   Program to print steps for tower of hanoi
   Link : https://www.geeksforgeeks.org/java-program-for-tower-of-hanoi/
*/
import java.io.*;
public class TowerOfHanoi{

  static void printTowerOfHanoi(int n,char source,char intermediate,char destination ){
    if(n==1){
      System.out.println("Move "+n+" from "+source+" to "+destination);
      return;
    }
    printTowerOfHanoi(n-1,source,destination,intermediate);
    System.out.println("Move "+n+" from "+source+" to "+destination);
    printTowerOfHanoi(n-1,intermediate,source,destination);
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of disks for tower of hanoi");
    Integer input = Integer.valueOf(br.readLine());
    System.out.println("The tower of hanoi steps are ");
    printTowerOfHanoi(input,'A','B','C');
  }
}
