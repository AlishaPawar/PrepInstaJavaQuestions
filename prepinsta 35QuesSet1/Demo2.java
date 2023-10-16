import java.util.Scanner; 
class Demo2{
	public static void main(String args[]){
//-------------------------------------------------------
						//Even or odd
		/*
		int num = 10 ;
		if(num % 2 == 0){
			System.out.println(num+" is Even");
		}
		else{
			System.out.println(num+" is Odd");
		}

		String res = num % 2 == 0 ? num+" is Even" : num+" is Odd";
		System.out.println(res);
		*/
//-----------------------------------------------------
		/*				//Sum of n numbers
		int n = 10;
		int sum = 0;
		for(int i = 0; i <= n; i++){
			sum += i; 
		}
			
		//sum = (n * (n + 1)) / 2;		//sum formula
		System.out.println(sum);
		*/
//------------------------------------------------------
		/*		//Sum of numbers in given range
		int m = 1;
		int n = 10;
		int sum = 0;
		for(int i = m; i <= n; i++){
			sum += i; 
		}
			
		//sum = (n * (n + 1)) / 2;		//sum formula
		System.out.println(sum);
		*/
//-------------------------------------------------------
		/*			//Greater of 2 numbers
		int num1 = 10;
		int num2 = 20;

		if(num1 > num2){
			System.out.println(num1 + " is Greater");
		}
		else{
			System.out.println(num2 + " is Greater");
		} 
		*/
//-------------------------------------------------------
		/*			//Greater of 3 numbers
		int num1 = 10;
		int num2 = 8;
		int num3 = 5;

		if(num1 > num2 && num1 > num3){
			System.out.println(num1 + " is Greater");
		}
		else if(num2 > num3){
			System.out.println(num2 + " is Greater");
		}
		else{
			System.out.println(num3+" is Greater");
		}
		int temp = num1 > num2 ? num1 : num2;
		int res = temp > num3 ? temp : num3;
		System.out.println(res+" is greater");
		*/
//-------------------------------------------------------
					//Leap year or Not
		int year = 2000;
		/*
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
			System.out.println(year+" is a Leap Year");
		}
		else{
			System.out.println(year+" is not a Leap Year");
		}
		
		boolean b = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)? true : false;
		if(true){
			System.out.println(year+" is a Leap Year");
		}
		else{
			System.out.println(year+" is not a Leap Year");
		}
		*/
//---------------------------------------------------------
		/*			//Prime Number
		int i;
		int n = 43;
		boolean isprime = true;

		if(n < 2){
			isprime = false;
		}
		else{
			for(i = 2; i < n; i++){
				if(n % i == 0){
					isprime = false;
				    break;
				}
			}
		}
		String res = isprime ? "prime" : "not prime";
		System.out.println(n+" is "+res+" number");
		*/
//-------------------------------------------------------------
					//Prime Number in given range
		/*Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the start number : ");
		int start = sc1.nextInt();

		System.out.println("Enter the last number : ");
		int last = sc1.nextInt();

		for(int i = start; i <= last; i++){
			if(isprime(i))
				System.out.println(i);
		}
		static boolean isprime(int n){
			if(n<2)
				return false;

			for(int i = 2; i < n; i++){
				if(n % i == 0)
					return false;
			}
			return true;
		}*/
//--------------------------------------------------------------
					//Sum of Digits of Number

		/*Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc1.nextInt();
		int sum = 0;

		while(num != 0){
			sum += num % 10;
			num = num/10;
		}
		System.out.println("Sum of Digits : "+sum);*/
//---------------------------------------------------------------
					//Reverse of Number

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc1.nextInt();

		int rem, reverse = 0;

		while(num != 0){
			rem = num % 10;
			reverse = reverse * 10 + rem;
			num = num/10;
		}

		System.out.println("Reverse Number : "+reverse);
//---------------------------------------------------------------
					//Reverse of Number

		int num = 9876;

		getReverse(num);

		static void getReverse(int num){
			if(num == 0)
				return 0;

			int rem = num % 10;
			System.out.println(rem);

			getReverse(num / 10);
		}
	}
}