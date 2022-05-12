import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int count = 0;
    Scanner scanner = new Scanner(System.in);
    int val = scanner.nextInt();

    for (int i = 0; i <= val; i++){
      String str = scanner.nextLine();
      String strArray[] = str.split(" ");
      int numArray[] = new int[strArray.length];
      for (int a = 0; a < strArray.length; a++) {
        numArray[a] = Integer.parseInt(strArray[a]);
      }
      int sum = 0;
      for (int j = 0; j < numArray.length; j++) {
        sum += numArray[j];
      }
      if (sum > 1) {
        count++;
      }
    }

    System.out.println(count);
  }
}
