import java.util.Scanner;

public class Application7
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value=0;
		do{
			System.out.println("Enter a number");
			value=scanner.nextInt();
			
			System.out.println("The number is" +value);
		}
		while(value!=5);
			System.out.println("got 5!!");
		
	}
}
