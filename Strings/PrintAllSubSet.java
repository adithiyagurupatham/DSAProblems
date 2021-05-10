/**
*/
import java.io.*;
public class PrintAllSubSet{
  static void printSubset(char[] charArray){
    for(int mask=0;mask<(1<<charArray.length);mask++){
      for(int i=0;i<charArray.length;i++){
        if((mask&(1<<i))!=0){
          System.out.print(charArray[i]);
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args)  throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Integer size = Integer.valueOf(br.readLine());
      char[] charArray = new char[size];
      br.read(charArray,0,size);
      System.out.println("The power set are ");
      printSubset(charArray);
  }

}
