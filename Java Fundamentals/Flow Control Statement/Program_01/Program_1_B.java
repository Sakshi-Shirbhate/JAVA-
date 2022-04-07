import java.util.Scanner;

public class Program_1_B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a =sc.nextInt();
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		int c,d;
		c = a % 10;
		d = b % 10;
		if(c==d)
		{
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}
