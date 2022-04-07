/*Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.

The strings will not be the same length, but they may be empty (length 0).

If input is "hi" and "hello", then output will be "hihellohi".
*/

import java.util.Scanner;

public class Assignment_06 {
	public static String shortLongShort(String str1, String str2)
	{
		if(str1.length() < str2.length())
		{
			return str1+str2+str1;
		}
		else {
			return str2+str1+str2;
		}
	}
	
	public static void main (String[] args)
	{
		String str1;
		String str2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st String");
		str1 = sc.nextLine();
		System.out.println("Enter the 2nd String");
		str2 = sc.nextLine();
		System.out.println(shortLongShort(str1,str2));
	}
}
