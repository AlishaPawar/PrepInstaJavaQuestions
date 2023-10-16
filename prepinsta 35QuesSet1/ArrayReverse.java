class Reverse{
	void reverseArray(int[] arr){
		int a = 0;
		int b = arr.length - 1;

		while(a < b){
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
			a++;
			b--;
		}
	}
}

class ArrayReverse{
	public static void main(String args[]){
		int array[] = {10, 20, 30, 40, 50};
		Reverse a1 = new Reverse();
		
		a1.reverseArray(array);

		for(int num : array){
			System.out.print(num +"\t");
		}
	
	}

}