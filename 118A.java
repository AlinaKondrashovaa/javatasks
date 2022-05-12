import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str="";
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    s = s.toLowerCase();
    for(int i=0;i<s.length();i++){
        if(s.charAt(i) == 'a' || s.charAt(i) == 'o' || s.charAt(i) == 'y' || s.charAt(i) == 'e' || s.charAt(i) =='u' || s.charAt(i) =='i'){
        } else {
            str+= "." + s.charAt(i);
        }
    }
    System.out.println(str);

    }
}

