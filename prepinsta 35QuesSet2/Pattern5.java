import java.util.Scanner;
class Pattern5
{
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter the row :");
		int row = sc1.nextInt();

		System.out.println("Enter the columns :");
		int col = sc1.nextInt();

		for(int i = 1; i <= row; i++){
			for(int j = 1; j <= col; j++){
				if((i == 1 || i == col) || (j == 1 || j == col))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}