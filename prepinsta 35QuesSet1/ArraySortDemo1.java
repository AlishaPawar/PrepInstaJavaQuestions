import java.util.Scanner;

class ArraySortDemo1{
	public static void main(String args[]){
		Scanner sc1 = new Scanner(System.in);

		int []arr = new int[5];

		for(int i = 0; i < arr.length; i++){
			arr[i] = sc1.nextInt();
		}

		for(int i = 0; i < arr.length; i++){
			for(int j = i + 1; j < arr.length; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;	
				}
			}
		}

		for(int i = 0; i <arr.length; i++){
			System.out.print(arr[i] +"  ");
		}
	}
}