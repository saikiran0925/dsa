package dsa;

class BubbleSortAlg {
	public void toSort(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 12, 4, 3, 19, 16 };
		BubbleSortAlg bs = new BubbleSortAlg();
		bs.toSort(arr);
		for (int k : arr) {
			System.out.println(k);
		}

	}

}
