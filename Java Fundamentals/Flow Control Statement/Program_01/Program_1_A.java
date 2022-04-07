import java.util.Scanner;


public class Program_1_A {
	public static void main(String[] args)
	{
		System.out.println("Enter the integer number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a<0)
		{
			System.out.println("Number is Negative");
		}
		else if(a>0)
		{
			System.out.println("Number is Positive");
		}
		else {
			System.out.println("Number is zero");
		}
	}
}
