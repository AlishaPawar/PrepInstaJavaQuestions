import java.util.Scanner;

class PowerBase{
	public static void main(String args[]){
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the base number : ");
		int base = sc1.nextInt();

		System.out.println("Enter the power of number : ");
		int power = sc1.nextInt();

		System.out.println("Required number is : "+number(base,power));
		
		}
		static int number(int base, int power){
			if(power == 0)
				return 1;
			return(base * number(base, power - 1));
		}
}