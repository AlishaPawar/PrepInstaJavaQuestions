class StringDemo1
{
	public static void main(String args[])
	{
		char ch ='A';

		if(isVowel(ch))
			System.out.println(ch +" is a vowel.");

		else
			System.out.println(ch +" is a consonant.");
	}

	static boolean isVowel(char ch)
	{
		ch = Character.toUpperCase(ch);

		return(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');	
	}
}