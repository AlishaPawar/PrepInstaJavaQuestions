class MergeSortedArraysWithoutExtraSpace 
{
    public static void merge(int[] arr1, int[] arr2, int m, int n) 
	{
        int i = m - 1; 
        int j = n - 1; 
        int k = m + n - 1; 

        while (i >= 0 && j >= 0) 
		{
            if (arr1[i] > arr2[j]) 
			{
                arr1[k] = arr1[i];
                i--;
            } 
			else{
                arr1[k] = arr2[j];
                j--;
            }

            k--;
        }

        while (j >= 0) 
		{
            arr1[k] = arr2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 0, 0, 0}; 
        int[] arr2 = {2, 4, 6};
        int m = 4; 
        int n = 3; 
        merge(arr1, arr2, m, n);

        System.out.print("Merged Array: ");

        for (int i = 0; i < m + n; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
