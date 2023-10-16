class StringDemo5{
	public static void main(String args[]){
		String s1 = "Alisha";
		System.out.println("Original String : "+s1);

		String s2 = s1.replaceAll("[AEIOUaeiou]", "");
		System.out.println("After removing vowels : "+s2);
		
	}
	
}