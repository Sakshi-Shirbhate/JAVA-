import java.util.Scanner;
public class Program_09 {
	public static void main(String[] args)
	{
		System.out.println("Enter the number of elements to be stored: ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[20];
		System.out.println("Enter the elements of array: ");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++)
		{
			if(arr[i]==10)
			{
				arr[i]=0;
			}
		}
		int count = 0; 
		for (int i = 0; i < n; i++)
		{
		    if (arr[i] != 0)
		        arr[count++] = arr[i];
		}
		while (count < n)
		{
		    arr[count++] = 0;
		}
  
		for(int i=0; i<n; i++)  {
		System.out.print(arr[i]+ " "); 
		}
	}
}
