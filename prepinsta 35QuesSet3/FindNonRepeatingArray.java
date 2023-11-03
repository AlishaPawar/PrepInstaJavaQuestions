import java.util.*;

class FindNonRepeatingArray 
{
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter size of an array");
		int n=sc1.nextInt();

		int arr[]=new int[n];

		System.out.println("Enter elements of an array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc1.nextInt();
		}

		FindNonRepeating(arr,n);
	}
	static void FindNonRepeating(int arr[],int n)
	{
		HashMap<Integer, Integer> result = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(result.containsKey(arr[i]))
			{
				result.put(arr[i],result.get((arr[i])+1));
			}
			else
			{
				result.put(arr[i],1);
			}
		}

		for(Map.Entry<Integer, Integer> entry : result.entrySet())
		{
			if((Integer)entry.getValue()==1)
			{
				System.out.println(entry.getKey());
			}
		}
	}
}