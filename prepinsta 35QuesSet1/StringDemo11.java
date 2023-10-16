class StringDemo11
{
	public static void main(String args[])
	{
		String str1 = "Hello, World";
		String str2 = "World";
		String str3 = "Friends";

		String str4 = str1.replace(str2,str3);

		System.out.println("Original String : "+str1);
		System.out.println("Modified String : "+str4);
	}
}