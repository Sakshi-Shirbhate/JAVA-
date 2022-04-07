import java.util.Scanner;

public class Program_17 {
	public static void main(String[] args)
	{
		int rev=0 ,d;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();
		int a=num;
		while(num!=0)
		{
			d=num%10;
			rev=rev*10+d;
			num=num/10;
		}
		if(a==rev)
		{
			System.out.println(a + " is a palindrome");
		}
		else {
			System.out.println(a + " is not a Palindrome");
		}
	}
}
