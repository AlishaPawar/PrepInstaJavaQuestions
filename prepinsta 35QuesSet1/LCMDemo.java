import java.util.Scanner;

class LCMDemo{
	public static void main(String args[]){
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		int num1 = sc1.nextInt();

		System.out.println("Enter the second number : ");
		int num2 = sc1.nextInt();

		int lcm = 0;

		int max = (num1 > num2) ? num1 : num2;

		for(int i = max; i <= num1*num2; i++){
			if(i % num1 == 0 && i % num2 == 0){
				lcm = i;
				break;
			}
		}
		System.out.println("LCM of "+num1+" and "+num2+" is : "+lcm);

	}
}