class PowerOfNumber
{
	public static void main(String args[])
	{
		int base = 2;
		int expo = 2;
		int res = 1;

		while(expo != 0)
		{
			res *= base;
			expo--;
		}
		System.out.println("Result : "+res);
	}
}