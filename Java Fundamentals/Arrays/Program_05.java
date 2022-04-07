
public class Program_05 {
	public static void main(String[] args)
	{
		int[] arr = {4,11,6,15,3,9};
		int temp=0;
		int len=arr.length;
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
		System.out.println("Largest 2 numbers : "+ arr[len-1]+" "+arr[len-2]);
		System.out.println("Smallest 2 numbers : "+ arr[0]+" "+arr[1]);
	}
}
