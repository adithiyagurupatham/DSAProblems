import java.io.*;
public class PrintSubSet{
  static void printSubset(String input,String curr,int i){
    if(i==input.length()){
      System.out.println(curr);
      return;
    }
    printSubset(input,curr,i+1);
    printSubset(input,curr+input.charAt(i),i+1);
  }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input");
    String input =  br.readLine();
    System.out.println("The subsets are ");
    printSubset(input,"",0);

  }
}
