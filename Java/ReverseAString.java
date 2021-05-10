import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();

		//your code goes here
		StringBuilder sb = new StringBuilder(text);
		System.out.println(sb.reverse());
	}
}