import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int ans=0;
    String s1 = "++X";
    String s2 = "X++";
    String s3 = "--X";
    String s4 = "X--";
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i=0;i<n;i++) {
        String s = scanner.next();
        if(s.equals(s1) || s.equals(s2)){
            ans++;
        }
        if(s.equals(s3) || s.equals(s4)){
            ans--;
        }
    }
    System.out.println(ans);
    }
  }
