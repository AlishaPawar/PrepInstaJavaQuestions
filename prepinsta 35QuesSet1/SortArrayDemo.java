class SortArrayDemo
{
	static void printArray(int[]arr){
		for(int i = 0;	i < arr.length; i++){
			for(int j = 0; j < arr.length/2; j++){
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}

			for(int j = arr.length/2; j < arr.length-1; j++){
				if(arr[j] < arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			} 
		}
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+"  ");
		}
	}

	public static void main(String args[]){
		int arr[] = {3, 2, 4, 1, 10, 30, 40, 20};
		printArray(arr);
	}

}