/*Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged. 

If the input is "xHix", then output is "Hi".
If the input is "America", then the output is "America".
*/
import java.util.Scanner;

public class Assignment_07 {
	public static String newString(String str)
	{
		String outStr="";
		int n=str.length();
		for(int i=0; i<n; i++)
		{
			if(i==0 || i==n-1) {
			if(str.charAt(0)=='x' || str.charAt(n-1)=='x')
			{
				continue;
			}
				outStr+=str.charAt(i);
			}
			else {
				outStr+=str.charAt(i);
			}
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

