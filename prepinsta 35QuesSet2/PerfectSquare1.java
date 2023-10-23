import java.util.Scanner;

class PerfectSquare1{
	static boolean isPerfectSquare(int num){
		if(num < 0){
			return false;
		}

		int sqrt = (int)Math.sqrt(num);
		return sqrt * sqrt == num;
	}

	public static void main(String args[]){
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc1.nextInt();

		isPerfectSquare(num);
		System.out.println(num+" is a perfect square");
	}
}