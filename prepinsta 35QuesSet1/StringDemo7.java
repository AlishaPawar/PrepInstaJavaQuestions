import java.util.Scanner;

class StringDemo7{
	public static void main(String args[]){
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Original String : ");
		String s1 = sc1.nextLine();

		String reversed = "" ;
		
		for(int i = s1.length()-1; i >= 0; i--){
			char ch = s1.charAt(i);
			reversed += ch;
		}
		System.out.println("Reversed : "+reversed);
	}
}