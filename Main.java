package udemyClassNotes;

public class Main 
{
	public static void main(String[] args)
	{
		int [] arr = {5,70,94,24,0,-4,96,69,47,31,74,66,777,786,99,54,62,37,58,14};
		System.out.println("UNSORTED ARRAY");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		QuickSort q = new QuickSort();
		q.quickSort(arr, 0, arr.length-1);
		System.out.println("USING QUICK SORT");
		q.printArray(arr);
		System.out.println();
		MergeSort m = new MergeSort();
		m.merge(arr, 0, 0, 0);
		System.out.println("USING MERGE SORT");
		m.printArray(arr);
	}
}