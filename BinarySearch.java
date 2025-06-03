
public class BinarySearch {
	
	public static void binarySearch(int arr[], int key)
	{
		int n = arr.length;
		
		int low = 0;
		int high = n - 1;
		int mid;
		
		while (low <= high)
		{
			mid = (low + high) / 2;
			
			if (key == arr[mid])
			{
				System.out.println("Key " + key + " found at index " + mid);
				return;
			}
			else if (key < arr[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}
		
		if (low > high)
			System.out.println("Key " + key + " is not found.");
		
	}

	public static void main(String[] args) {
		
		int array1[] = { 2, 4, 6, 8, 10, 12 };
		
		int key = 10;
		
		binarySearch(array1, key);

	}

}
