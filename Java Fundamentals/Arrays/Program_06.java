
public class Program_06 {
	public static void main(String[] args)
	{
		int[] arr = {4,11,6,15,3,9};
		int temp=0;
		int len=arr.length;
		System.out.print("Initialized array : ");
		for(int i=0; i<len; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0; i<len; i++)
		{
			for(int j=i+1; j<len; j++)
			{
				if(arr[j]<arr[i])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.print("Sorted array : ");
		for(int i=0; i<len; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
