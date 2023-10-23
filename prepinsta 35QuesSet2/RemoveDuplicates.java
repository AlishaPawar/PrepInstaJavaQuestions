import java.util.Scanner;
class RemoveDuplicates{
	static String removeAdjacentDuplicates(String str){
		if(str == null || str.length() <= 1){
			return str;
		}

		if(str.charAt(0) == str.charAt(1)){
			int i = 2;
			while(i < str.length() && str.charAt(i) == str.charAt(i - 1)){
				i++;
			}
			return removeAdjacentDuplicates(str.substring(i)); 
		}
		else{
			return str.charAt(0) + removeAdjacentDuplicates(str.substring(1));
		}

	}

	public static void main(String args[]){
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc1.nextLine();
		String result = removeAdjacentDuplicates(str);
		System.out.println("Modified String : "+result);
	}
}