package dsa;

public class Problem3 {
	public int finalAlgorithm(int arr[], int x, int y) {
		findingIndex ob = new findingIndex();
		int lowIndex = ob.modBinarySearchForLeft(arr, x);
		int highIndex = ob.modBinarySearchForRight(arr, y);
		int result = highIndex + 1 - lowIndex;
		return result;

	}

	class findingIndex {
		int modBinarySearchForLeft(int array[], int left_range) {
			int length = array.length;
			if (array[length - 1] < left_range)
				return -1;

			int low = 0;
			int high = length - 1;

			while (low <= high) {
				int mid = low + ((high - low) / 2);

				if (array[mid] >= left_range)
					high = mid - 1;
				else
					low = mid + 1;
			}

			return high + 1;
		}

		int modBinarySearchForRight(int array[], int right_range) {
			int length = array.length;
			if (array[0] > right_range)
				return -1;

			int low = 0;
			int high = length - 1;

			while (low <= high) {
				int mid = low + ((high - low) / 2);

				if (array[mid] > right_range)
					high = mid - 1;
				else
					low = mid + 1;
			}

			return low - 1;
		}

	}
}
