import java.util.Scanner;

class GoldbachConjecture 
{
    public static void main(String[] args) 
	{
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter an even number greater than 2: ");
        int n = sc1.nextInt();

        if (n <= 2 || n % 2 != 0) 
		{
            System.out.println("Input is not a valid even number greater than 2.");
        } 
		else
		{
            if (canExpressAsSumOfPrimes(n)) 
			{
                System.out.println(n + " can be expressed as the sum of two prime numbers.");
            } 
			else 
			{
                System.out.println(n + " cannot be expressed as the sum of two prime numbers.");
            }
        }

    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean canExpressAsSumOfPrimes(int n) 
	{
        for (int i = 2; i <= n / 2; i++) 
		{
            if (isPrime(i) && isPrime(n - i)) 
			 {
                return true;
            }
        }
        return false;
    }
}
