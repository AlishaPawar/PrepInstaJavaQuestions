class Demo1{
	public static void main(String args[]){
		int num = 5;
		/*if(num >0){
			System.out.println(num+" is Positive");
		}
		else{
			System.out.println(num+" is Neagtive");
		}*/

		String res = num > 0 ? num +" is positive" : num +" is negative";
		System.out.println(res); 

	}
}