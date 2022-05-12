import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String b = scanner.nextLine();
        String c = scanner.nextLine();
        String d = "";
        for (int i = b.length()-1; i >= 0 ; i--) {
            d+=b.charAt(i);
        }
        if(c.equals(d)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
