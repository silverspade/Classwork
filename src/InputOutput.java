import java.util.Scanner;


public class InputOutput {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		System.out.println(text);
		in.close();
	}
}