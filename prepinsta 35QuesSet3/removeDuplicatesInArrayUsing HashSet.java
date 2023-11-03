class removeDuplicatesInArrayUsingHashSet{
	public static void main(String args[]){
		int arr[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};
		int n = arr.length;
		Set hashSet = new HashSet();
		
		for(int i = 0; i < n; i++){
			hashSet.add(arr[i]);
		}
		System.out.println(hashSet);
	}
}