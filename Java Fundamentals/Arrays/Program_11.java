import java.util.Scanner;

public class Program_11 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements to be stored: ");
		int n= sc.nextInt();
		int[] arr=new int[20];
		int sum=0;
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]==1 || arr[i]==4)
			{
				sum++;
			}
		}
		if(sum==n)
		{
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}
