class DecimalToOctal
{
	public static void main(String args[])
	{
		int decimal = 148;

		String octal = Integer.toOctalString(decimal);
		String hexa = Integer.toHexString(decimal);

		System.out.println("Octal Number :"+octal);
		System.out.println("Hexadecimal Number :"+hexa);
	}
}