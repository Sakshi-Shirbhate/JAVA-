/*Write a java program that accepts a string and returns a new string without the first and last character of the input string.

Example1)
i/p:Suman
o/p:uma
*/


import java.util.Scanner;

public class Assignment_05 {
	public static String newString(String str)
	{
		String outStr="";
		int n=str.length();
		for(int i=0; i<n; i++)
		{
			if(i==0 || i==n-1)
			{
				continue;
			}
			outStr+=str.charAt(i);
		}
		return outStr;
	}
	
	
	public static void main(String[] args)
	{
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str = sc.nextLine();
		System.out.println(newString(str));
	}
}
