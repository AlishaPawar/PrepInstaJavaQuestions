class HexToDecimalConverter{
	public static void main(String args[]){
		String hexadecimal = "C9";

		int decimal = Integer.parseInt(hexadecimal, 16);

		System.out.println("Hexadecimal number : "+hexadecimal);
		System.out.println("Decimal Number : "+decimal);
	}
}