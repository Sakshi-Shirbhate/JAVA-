import java.util.Scanner;

public class Program_10 {
	public static void main(String[] args)   
	{   
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter the number of elements to be stored: ");  
	int n=sc.nextInt();
	int[] array = new int[20];  
	System.out.println("Enter the elements of the array: ");  
	for(int i=0; i<n; i++)  
	{  
	array[i]=sc.nextInt();  
	}  
	for(int i=0; i<n; i++)  {
	if(array[i]%2==0) {
		System.out.print(array[i]+" ");
	}
	}
	for(int i=0; i<n; i++)  {
	if(array[i]%2!=0) {
		System.out.print(array[i]+" ");
	}
	}	
	}
}
