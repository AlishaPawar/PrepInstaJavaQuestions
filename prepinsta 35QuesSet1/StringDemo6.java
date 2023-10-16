class StringDemo6{
	public static void main(String args[]){
		String s1 = "Alisha";
		String s2 = s1.toLowerCase();
		int vowels = 0;

		for(int i = 0; i < s1.length(); i++){
			char ch = s2.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				vowels++;
			}
		}
		System.out.println("Number of vowels in '"+s1+"' is : "+vowels);
	}
}