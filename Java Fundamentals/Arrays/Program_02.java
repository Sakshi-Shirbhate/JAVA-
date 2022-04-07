
public class Program_02 {
	public static void main(String[] args)
	{
		int[] arr= {30,60,20,70};
		int n=arr.length;
		int min=arr[0];
		int max=arr[0];
		for(int i=0; i<n; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("The maximum value of the array is: "+ max);
		System.out.println("The minimum value of the array is: "+ min);
	}
}
