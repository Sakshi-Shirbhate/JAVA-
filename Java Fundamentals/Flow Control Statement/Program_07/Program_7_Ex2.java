
public class Program_7_Ex2 {
	public static void main(String[] args)
	{
		char ch = 'A';
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
