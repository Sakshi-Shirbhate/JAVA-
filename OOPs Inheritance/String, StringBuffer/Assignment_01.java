//Write a Program to check whether a given String is Palindrome or not.

public class Assignment_01 {
	
	static boolean isPalindrome(String str)
	{
		int i=0;
		int j = str.length() - 1 ;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		String str = "Level";
		str = str.toLowerCase();
		
		if(isPalindrome(str)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
