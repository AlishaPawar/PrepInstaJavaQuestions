import java.util.Scanner;

class StringDemo9
{
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = sc1.nextLine();

		char ch[] = s1.toCharArray();
		StringBuffer sb = new StringBuffer();

		for(int i = 0; i < ch.length; i++)
		{
			if((ch[i] != ' ')&&(ch[i] != '\t'))
			{
				sb.append(ch[i]);
			}
		}

		System.out.println("After removing space : "+sb);
	}
}