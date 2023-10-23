import java.util.Scanner;
class Pattern3{
	public static void main(String args[]){
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc1.nextInt();

		for(int i = 0; i < num; i++){
			for(int j = 0; j < num ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}