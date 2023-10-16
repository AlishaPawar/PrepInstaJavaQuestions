import java.util.Scanner;

class StringDemo8{
	public static void main(String args[]){
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = sc1.nextLine();

		s1 = s1.replaceAll("[^a-zA-Z]", "");

		System.out.println("After removing special characters : "+s1);
	}
}