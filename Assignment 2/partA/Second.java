import java.util.Scanner;

public class Second
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		String input = scan.nextLine();
		String[]splitsting = input.split(" ");
		for(int i = splitsting.length - 1; i > -1; i--)
		{
			System.out.print(splitsting[i] + " ");
		}
	}
}