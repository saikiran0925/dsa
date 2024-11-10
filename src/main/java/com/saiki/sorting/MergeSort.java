package dsa;

class MergeSortAlg {
	static void toSort(int[] arr) {

		int n = arr.length;
		if (n < 2)
			return;
		int midIndex = n / 2;
		int[] leftArr = new int[midIndex];
		int[] rightArr = new int[n - midIndex];
		for (int i = 0; i < midIndex; i++)
			leftArr[i] = arr[i];
		for (int j = midIndex; j < n; j++)
			rightArr[j - midIndex] = arr[j];
		toSort(leftArr);
		toSort(rightArr);
		merge(arr, leftArr, rightArr);
	}

	private static void merge(int[] arr, int[] leftArr, int[] rightArr) {
		int ln = leftArr.length;
		int rn = rightArr.length;
		int i = 0, j = 0, k = 0;
		while (i < ln && j < rn) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}

		while (i < ln) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while (j < rn) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}

	}
}

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 19, 24, 25, 9, 1 };
		MergeSortAlg.toSort(arr);
		for (int a : arr)
			System.out.println(a);
	}

}
