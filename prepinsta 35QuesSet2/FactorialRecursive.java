class FactorialRecursive{
	public static long factorial(int n){
		if(n == 0 || n == 1){
			return 1;
		}else{
			return n * factorial(n - 1);
		}
	}
	public static void main(String args[]){
		int n = 3;
		long res = factorial(n);
		System.out.println("Factorial of a "+n+" is :"+res);
	}
}