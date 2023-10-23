import java.util.Scanner;

class CircleArea
{
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter the radius of circle :");
		double radius = sc1.nextDouble();

		double area = 3.14 * radius * radius;
		System.out.println("Area of circle : "+area);
	}
}