import java.util.Scanner;

class StringUpperCase
{
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the Sentence : ");
		String sentence = sc1.nextLine();

		String newSentence = "";

		String str[] = sentence.split(" ");

		for(String s : str){
			int length = s.length();

			String first = s.substring(0,1);
			String between = s.substring(1,length-1);
			String last = s.substring(length-1);

			newSentence += first.toUpperCase()+between+last.toUpperCase()+" ";
		}
		System.out.println("New Sentence : "+newSentence); 
	}
}