import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int length = 0;
        int width = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        while (n>0){
            n-=a;
            length++;
        }
        m-=a;
        width++;
        while (m>0){
            m-=a;
            width++;
        }
        System.out.println(length*width);
    }
}
