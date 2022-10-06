package dsa;

class InsertionSortAlg {

	public static void toSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}

	}

}

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 19, 24, 5, 7, 19 };
		InsertionSortAlg.toSort(arr);
		for (int k : arr)
			System.out.println(k);

	}

}
