import java.util.Scanner;

public class Summation {
	public static void main (String[] args) {
		System.out.println("Enter a starting value: ");
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		System.out.println("Enter a ending value: ");
		int j = in.nextInt();
		System.out.println("Please choose 1. While, 2. Do-While, 3. For: ");
		int decision = in.nextInt();
		int total = 0;
		in.close();
		switch (decision) {
		case 1:
			while (i <= j) {
				total += i;
				i++;
			}
			System.out.println(total);
			break;
		case 2:
			do {
				total += i;
				i++;
			} while (i < j);
			System.out.println(total);
			break;
		case 3:
			for (i = i; i <= j; i++) {
				total += i;
			}
			System.out.println(total);
			break;
		}
	}
}
