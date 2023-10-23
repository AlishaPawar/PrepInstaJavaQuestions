import java.util.Scanner;

class ReplaceString
{
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter the string : ");
		String str = sc1.nextLine();

		System.out.println("Enter the word to remove from above string : ");
		String word = sc1.next();

		String res = str.replace(word,"");
		System.out.println("Modified String : "+res);
	}
}