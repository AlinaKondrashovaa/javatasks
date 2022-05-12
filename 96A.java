import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		String position = scanner.nextLine();
		boolean k = false;
		int counter = 1;
		position = position + '.';
		for (int i = 0; i < position.length()-1; i++) {
			if (position.charAt(i) == position.charAt(i+1)) {
				counter++;
			} else {
				if (counter >= 7) {
					k = true;
					break;
				} else {
					counter = 1;
				}
			}
		}
		if (k) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}	
