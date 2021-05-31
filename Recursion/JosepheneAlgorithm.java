import java.io.*;
public class JosepheneAlgorithm{
  static int getSurvival(int n,int k){
    if(n==1){
      return 0;
    }
    int val = getSurvival(n-1,k);
    return (val+k)%n;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the soldier number");
    Integer input =  Integer.valueOf(br.readLine());
    System.out.println("Enter the k value");
    Integer k =  Integer.valueOf(br.readLine());
    System.out.println("The last suriving person is "+getSurvival(input,k));
  }
}
