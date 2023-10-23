import java.util.Scanner;
class Pattern4
{
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter the row :");
		int row = sc1.nextInt();

		System.out.println("Enter the columns :");
		int col = sc1.nextInt();

		for(int i = 0; i < row; i++){
			for(int j = 0; j < col ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}