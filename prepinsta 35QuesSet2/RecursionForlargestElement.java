class RecursionForlargestElement{
	static int []arr ={10, 45, 67,34,99, 42};

	static int largest(){
		int max = arr[0];
		for(int i = 1; i < arr.length; i++)
			if(arr[i] > max)
				max = arr[i];
		return max;
		
	}

	public static void main(String args[]){
		System.out.println("Largest number in an array : "+largest());
	}
}