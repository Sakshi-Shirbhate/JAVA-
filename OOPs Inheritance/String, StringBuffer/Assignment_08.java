/*Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed-*, the characters that are to the left and right of *

Example1)
i/p:ab*cd
o/p:ad
*/

public class Assignment_08 {
	public static String excludeStar(String str)
	{
		
		int len = str.length();
		String outStr = "";
		for (int i = 0; i < len; i++) 
		{
			if (i == 0 && str.charAt(i) != '*')
		      outStr += str.charAt(i);
		    if (i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*')
		      outStr += str.charAt(i);
		    if (i > 0 && str.charAt(i) == '*' && str.charAt(i-1) != '*')
		      outStr = outStr.substring(0,outStr.length()-1);
		  }
		  return outStr;
	}
	
	public static void main(String[] args) {
		String str="ab*cd";
		System.out.println(excludeStar(str));
	}
}
