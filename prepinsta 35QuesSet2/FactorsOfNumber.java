import java.util.Scanner;

class FactorsOfNumber
{
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc1.nextInt();
		System.out.println("Factors of "+num+" are : ");
		
		for(int i = 1; i <= num; i++){
			if(num % i == 0)
				System.out.print(i +" ");
		}
	}
}