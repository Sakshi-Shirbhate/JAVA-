import java.util.Scanner;

public class Program_08 {
	public static void main(String[] args)
	{
		int[] arr=new int[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of array element");
		int n=sc.nextInt();
		
		System.out.println("Enter the array element");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum = 0;
		int flag = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] == 6)
				flag = 1;
			else if(arr[i] == 7) {
					flag = 0;
					i++;
			}
			if(flag != 1)
				sum = sum + arr[i];
		}
		System.out.println(sum);
	}
}
