import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		//your code goes here
		for (int i = 0; i < 3; i++)  {
			amount -= (amount * 10 / 100);
		}

		System.out.println(amount);
	}
}