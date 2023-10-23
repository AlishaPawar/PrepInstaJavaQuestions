import java.util.Scanner;

class ReplaceNumber
{
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter the number : ");
		String num = sc1.nextLine();

		System.out.println("Original Number : "+num);

		String res = num.replace("0", "1");

		System.out.println("Modified Number : "+res);
		
	}
}