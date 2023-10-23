import java.util.Scanner;

class OctalToBinaryConverter{
	public static void main(String args[]){
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the octal number : ");
		String octal = sc1.nextLine();

		int decimal = Integer.parseInt(octal, 8);

		String binary = Integer.toBinaryString(decimal);
		System.out.println("Binary number of given number : "+binary);
	}
}