import java.util.Scanner;

public class Program_16 {
	public static void main(String[] args)
	{
		int rev=0 ,d;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();
		while(num!=0)
		{
			d=num%10;
			rev=rev*10+d;
			num=num/10;
		}
		System.out.println(rev);
	}
}
