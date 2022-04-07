
public class Program_7_Ex1 {
	public static void main(String[] args)
	{
		char ch = 'a';
		char chr;
		if(ch>='a' && ch<='z')
		{
			chr = Character.toUpperCase(ch);
			System.out.println(ch + "->" + chr);
		}
		else if(ch>='A' && ch<='Z')
		{
			chr= Character.toLowerCase(ch);
			System.out.println(ch + "->" + chr);
		}
	}
}
