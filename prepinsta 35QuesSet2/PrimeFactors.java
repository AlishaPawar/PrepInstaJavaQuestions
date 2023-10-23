import java.util.Scanner;

class PrimeFactors
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Prime factors of " + num + " are: ");
        findPrimeFactors(num);
    }

    static void findPrimeFactors(int n) 
	{
        for (int i = 2; i <= n; i++) 
		{
            while (n % i == 0) 
			{
                System.out.print(i + " ");
                n /= i;
            }
        }
    }
}
