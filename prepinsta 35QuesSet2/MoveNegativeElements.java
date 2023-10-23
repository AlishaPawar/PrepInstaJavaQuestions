class MoveNegativeElements{
	static void moveNegative(int[] arr){
		int left = 0;
		int right = arr.length - 1;

		while(left <= right){
			if(arr[left] < 0 && arr[right] < 0){
				left++;
			}
			else if(arr[left] > 0 && arr[right] < 0){
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;

				left++;
				right--;
			}
			else if(arr[left] < 0 && arr[right] > 0){
				left++;
				right--;
			}
			else{
				right--;
			}
		}
	}
	public static void main(String args[]){
		int []arr ={-19, 26,-33, 45, 50, -86, 72, -78};

		System.out.println("Array Given : ");
		for(int n : arr){
			System.out.print(n+" ");
		}
		System.out.println();
		moveNegative(arr);
		System.out.println("Array Modified : ");
		for(int n : arr){
			System.out.print(n+" ");
		}

	}
}