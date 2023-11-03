class OccurrenceOfDigits{
	public static void main(String args[]){
		int x = 456558;
		int count = 0;
		char a = '5';

		String str = Integer.toString(x);

		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == a)
			count += 1;
		}  
		System.out.println(count);
	}
}