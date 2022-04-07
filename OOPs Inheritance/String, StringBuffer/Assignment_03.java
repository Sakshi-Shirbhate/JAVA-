/*Given a string, return a new string made of 'n' copies of the first 2 chars of the original string 
 where 'n' is the length of the string.

Example1)
i/p:Wipro
o/p:WiWiWiWiWi
*/

public class Assignment_03 {
	public static void copyString(String str, int n) {
		String repStr = str.substring(0, 2);
		String outStr = "";
		
		for (int i = 0; i < n ; i++) {
			outStr += repStr;
		}
		System.out.println(outStr);
	}
	public static void main(String[] args) {
		String str="Wipro";
		int n = str.length();
		copyString(str, n);
	}
}
