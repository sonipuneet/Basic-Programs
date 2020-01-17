package Sorting;

public class BubbleSort {
	/*
	 * Bubble Sort : Sort the adjacent elements by swapping them. Bubble sort always
	 * runs Time Complexity O(n^2) even if the array is sorted.
	 * 
	 * It can be optimized by stopping the algorithm if inner loop didn’t cause any
	 * swap.
	 * 
	 * Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array
	 * is reverse sorted.
	 * 
	 * Best Case Time Complexity: O(n). Best case occurs when array is already
	 * sorted.
	 * 
	 * Auxiliary Space: O(1)
	 * 
	 */
	public void bubbleSort(int[] num) {
		int array_length = num.length;

		for (int i = 0; i < array_length - 1; i++) {
			for (int j = 0; j < array_length - i - 1; j++) {

				if (num[j] > num[j + 1]) {
					// Swap the elements
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
	}

	public void bubbleSortOptimized(int[] num) {
		int array_length = num.length;

		// By putting a flag for swapping whether true or false.
		boolean swapped;

		for (int i = 0; i < array_length - 1; i++) {
			/*
			 * To check if the array is sorted or not. If not sorted, then the loop will
			 * continue to swap values.
			 */
			swapped = false;

			for (int j = 0; j < array_length - i - 1; j++) {

				if (num[j] > num[j + 1]) {
					// Swap the elements
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;

					/*
					 * Returns the true value if the array values are swapped.
					 */
					swapped = true;
				}
			}
			if (swapped == false) {
				break;
			}
		}
	}

	public void printValues(int[] num) {
		int array_length = num.length;

		for (int i = 0; i < array_length; i++) {

			System.out.print(" " + num[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("------- BUBBLE SORT ------- \n \n");

		BubbleSort bs = new BubbleSort();

		// int[] num = new int[] { 2, 3, 5, 6, 1, 2, 4, 3, 9, 6 }; // Unsorted Array

		int[] num = new int[] { 30, 31, 32, 34, 38, 40 }; // Sorted Array

		System.out.print("Array Unsorted values:");
		bs.printValues(num);

		System.out.print("\n");
		// bs.bubbleSort(num);
		bs.bubbleSortOptimized(num);
		System.out.print("Array sorted values:");
		bs.printValues(num);
		// System.out.println("");

	}

}
