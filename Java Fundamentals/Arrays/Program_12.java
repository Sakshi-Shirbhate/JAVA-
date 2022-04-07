import java.util.Scanner;
public class Program_12 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the 3 elements of first array: ");
		int[] arrayA = new int[20];
		int[] arrayB = new int[20];
		for(int i=0; i<3; i++)
		{
			arrayA[i]=sc.nextInt();
		}
		System.out.print("Enter the 3 elements of second array: ");
		for(int j=0; j<3; j++)
		{
			arrayB[j]=sc.nextInt();
		}
		System.out.println("["+arrayA[1]+","+arrayB[1]+"]");
	}
}
