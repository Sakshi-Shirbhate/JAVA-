
public class Program_14 {
	public static void main(String[] args)
	{
		int num = 1234 ;
		int sum = 0, rem;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
	}
}
