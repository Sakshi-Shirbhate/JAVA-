/*Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase.

Note:If the concatenation creates a double-char, then one of the characters need to be omitted.

Example1)
i/p:Sachin,Tendulkar
o/p:sachin tendulkar

Example2)
i/p:Mark,kate
o/p:markate
*/

import java.util.Scanner;

public class Assignment_02 {
	public static String concatenate(String str1 , String str2) {
		String outStr ="" ;
		if(str1.charAt(str1.length()-1) == str2.charAt(0)){
			outStr = str1.substring(0,str1.length()-1) + str2;
		}
		else {
			outStr = str1 +" "+ str2 ;
		}
		return outStr;
	}
	
	
	public static void main(String[] args)
	{
		String str1;
		String str2;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the 1st String");
		str1 = sc.nextLine();
		str1 = str1.toLowerCase();
		
		System.out.println("Enter the 2st String");
		str2 = sc.nextLine();
		str2 = str2.toLowerCase();
		
		System.out.println(concatenate(str1, str2));
	}
}
