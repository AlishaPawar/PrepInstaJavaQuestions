import java.util.Scanner;

class PerfectNumber
{
	static int sum = 0;

	static int isPerfect(int i, int num)
	{
		if(i <= num/2){
			if(num % i == 0)
				sum += i;

			i++;
			
			isPerfect(i, num);
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc1.nextInt();

		if(isPerfect(1, num) == num)
			System.out.println(num+" is perfect number");
		else
			System.out.println(num+" is not a perfect number");
	}
}