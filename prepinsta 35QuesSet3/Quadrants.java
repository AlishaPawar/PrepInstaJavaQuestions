import java.util.Scanner;

class Quadrants{
	public static void main(String args[]){
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter the first number :");
		int x = sc1.nextInt();

		System.out.println("Enter the second number :");
		int y = sc1.nextInt();

		if(x > 0 && y > 0)
			System.out.println(x+" and "+y+" lies in Quadrant 1.");

		else if(x < 0 && y > 0)
			System.out.println(x+" and "+y+" lies in Quadrant 2.");

		else if(x < 0 && y < 0)
			System.out.println(x+" and "+y+"	lies in Quadrant 3.");

		else
			System.out.println(x+" and "+y+"	lies in Quadrant 4.");

	}
}