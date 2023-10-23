import java.util.Scanner;

class BinaryToOctalConverter{
	public static void main(String args[]){
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the binary number : ");
		String binary = sc1.nextLine();

		int decimal = Integer.parseInt(binary, 2);

		String octal = Integer.toOctalString(decimal);
		System.out.println("Octal number of given number : "+octal);
	}
}