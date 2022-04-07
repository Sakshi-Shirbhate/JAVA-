/*Write a java program that will return the first half of the string, if the length of the string is even.
 It should return null for odd length string.

Example1)
i/p:TomCat
o/p:Tom

Example2)
i/p:Apron
o/p:null
*/


import java.util.Scanner;

public class Assignment_04 {
	public static String getHalfString(String str) {
		int n = str.length();
		String outStr="";
		if(n%2==0)
		{
			for(int i=0; i<n/2; i++)
			{
				outStr+=str.charAt(i);
			}
			return outStr;
		}
		return outStr="null";
	}
	public static void main(String[] args)
	{
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str = sc.nextLine();
		System.out.println(getHalfString(str));
	}
}
