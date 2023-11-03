import java.util.Scanner;

public class AddFractions
{
    public static void main(String[] args) 
	{
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter the numerator of the first fraction: ");
        int numerator1 = sc1.nextInt();

        System.out.print("Enter the denominator of the first fraction: ");
        int denominator1 = sc1.nextInt();

        System.out.print("Enter the numerator of the second fraction: ");
        int numerator2 = sc1.nextInt();

        System.out.print("Enter the denominator of the second fraction: ");
        int denominator2 = sc1.nextInt();

        int commonDenominator = denominator1 * denominator2;
c
        int resultNumerator = (numerator1 * denominator2) + (numerator2 * denominator1);

        System.out.println("The sum of the fractions is: " + resultNumerator + "/" + commonDenominator);
    }
}
