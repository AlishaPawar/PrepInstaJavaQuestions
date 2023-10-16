class SecondSmallestElementinArray
{
	static int secSmallest(int arr[], int n)
	{
		int smallest = arr[0];

		for(int i =0; i<n; i++)
		{
			if(arr[i] < smallest)
				smallest = arr[i];
		}
		
		int sec_smallest = Integer.MAX_VALUE;

		for(int i = 0; i < n; i++)
		{
			if(arr[i] != smallest && arr[i] < sec_smallest)
				sec_smallest = arr[i]; 
		}
	return sec_smallest;
	}

	public static void main(String args[])
	{
		int arr[] = {10, 52, 86, 45, 5, 45};
		int n = arr.length;
		System.out.println(secSmallest(arr,n));
	}
}