import java.util.Scanner;

public class Program_03 {
	public static void main(String[] args)
	{
		int[] arr= {1,4,34,56,7};
		int len=arr.length;
		int k=-1;
		System.out.println("Enter the number to be searched : ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0; i<len; i++)
		{
			if(num==arr[i])
			{
				k=i;
			}
		}
		System.out.println(k);
	}
}
