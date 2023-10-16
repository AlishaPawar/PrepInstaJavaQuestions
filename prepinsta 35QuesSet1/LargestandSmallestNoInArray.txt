class LargestandSmallestNoInArray{
	public static void main(String args[]){
		int []arr1 = {10, 20, 5, 87, 69, 42};
		int max = arr1[0];

		for(int i = 0; i<arr1.length; i++){
			if(max < arr1[i]){
				max = arr1[i];
			}
		}
		System.out.println(max);

		int []arr2 = {10, 20, 5, 87, 69, 42};
		int min = arr2[0];

		for(int i = 0; i<arr2.length; i++){
			if(min > arr2[i]){
				min = arr2[i];
			}
		}
		System.out.println(min);
	}
}