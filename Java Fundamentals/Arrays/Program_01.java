
public class Program_01 {
	public static void main(String[] args)
	{
		int[] arr = {23,45,67};
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		int avg=sum/arr.length;
		System.out.println("The sum is: "+sum);
		System.out.println("The average is: "+avg);
	}
}
