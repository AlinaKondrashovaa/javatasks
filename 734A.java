import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String k = sc.nextLine();
        int a=0;
        int d=0;
        for(int i=0;i<k.length();i++){
            if(k.charAt(i)=='A'){
                a+=1;
            }else if(k.charAt(i)=='D'){
                d+=1;
            }
        }
        if(a>d){
            System.out.println("Anton");
        }else if(a<d){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
    }
}
