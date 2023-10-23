import java.util.Scanner;

class LCMUsingRecursion{
	static int LCM(int a, int b){
		return a * b / GCD(a, b);
	}

	static int GCD(int a, int b){
		if(b == 0){
			return a;
		}
		return GCD(b, a % b);
	}

	public static void main(String args[]){
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the two numbers : ");
		int a = sc1.nextInt();
		int b = sc1.nextInt();

		int lcm = LCM(a, b);
		System.out.println("LCm of "+a+" and "+b+" : "+LCM(a, b));	}
}