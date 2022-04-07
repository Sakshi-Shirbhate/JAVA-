
public class Program_14 {
	public static void main(String[] args)
	{
		if(args.length != 9) {
			System.out.println("Please enter 9 integer numbers");
		}
		else {
			int[][] array = new int[3][3];
			int x = 0;
			//storing elements
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					array[i][j] = Integer.parseInt(args[x++]);
				}
			}
			
			System.out.println("The given array is :");				
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(array[i][j] + "\t");
				}
				System.out.println();
			}
			int max = 0;
			for(int i = 0; i < 3; i++) {
				for(int j = 0;j < 3; j++) {
					if(array[i][j] > max)
						max = array[i][j];
				}
			}
			System.out.println("The biggest number in the given array is "+max);
		}

	}
}
