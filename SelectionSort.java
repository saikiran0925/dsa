package dsa;

class SelectionSortAlg {
	public void toSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n - 1; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;

		}

	}
}

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 19, 24, 7, 10, 25 };
		SelectionSortAlg ss = new SelectionSortAlg();
		ss.toSort(arr);
		for (int k : arr) {
			System.out.println(k);
		}

	}

}
