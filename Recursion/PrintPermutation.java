import java.io.*;
public class PrintPermutation{

  static String swap(String input,int x,int y){
    char temp = input.charAt(x);
    StringBuilder sb = new StringBuilder(input);
    sb.setCharAt(x,sb.charAt(y));
    sb.setCharAt(y,temp);
    return sb.toString();
  }

  static void permute(String s,int i){
    if(i==s.length()-1){
      System.out.println(s);
      return;
    }
    for(int j=i;j<s.length();j++){
      String swapped = swap(s,i,j);
      permute(swapped,i+1);
      swapped = swap(swapped,j,i);
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the string");
    String input =  br.readLine();
    System.out.println("The permutation of the string are ");
    permute(input,0);
  }
}
