import java.io.*;
public class MultipleRecursionCalls{
  static void print(int n){
    if(n==0){
      return;
    }
    System.out.println(n);
    print(n-1);
    print(n-1);
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Integer input = Integer.valueOf(br.readLine());
    print(input);
  }
}
