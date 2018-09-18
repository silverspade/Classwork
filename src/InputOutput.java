import java.util.Scanner;


public class InputOutput {
	public static void main (String[] args) {
		System.out.println("What's your name?");
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		System.out.println("Hello, " + text + "!");
		in.close();
	}
}