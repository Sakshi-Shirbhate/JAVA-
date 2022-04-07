import java.util.Scanner;

public class Program_12 {
	public static void main(String[] args)
	{
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag = 0;
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime Number");
		}
	}
}
