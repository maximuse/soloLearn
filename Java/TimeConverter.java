import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();

		//your code goes here
		System.out.println(days * 24 * 60 * 60);
	}
}