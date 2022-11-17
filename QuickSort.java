package udemyClassNotes;

public class QuickSort {

	public void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi -1);
			quickSort(arr, pi + 1, high);
		}
	}

	public int partition(int[] arr, int low, int high) {
		int pi = high;
		int i = low - 1;
		for (int j= low; j<=high; j++) 
		{
			if (arr[j] <= arr[pi]) 
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		return i;
	}

	public void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}
}