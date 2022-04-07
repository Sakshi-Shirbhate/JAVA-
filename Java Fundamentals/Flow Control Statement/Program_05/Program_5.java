
public class Program_5 {
	public static void main(String[] args) {
		char var = '$';
		if((var>='a' && var<='z')||(var>='A' && var<='Z'))
		{
			System.out.println("Alphabet");
		}
		else if( var >= 48 && var <= 57 )
		{
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Character");
		}
	}
}
