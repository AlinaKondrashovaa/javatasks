import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int c = scanner.nextInt();
            int b = scanner.nextInt();
            if(b - c >= 2){
                count += 1;
            }
        }
        System.out.println(count);
    }
}
