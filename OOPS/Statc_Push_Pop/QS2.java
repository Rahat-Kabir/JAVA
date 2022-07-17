public class QS2 {

	public static double[][] modifyArray(double[][] arr) {
		// finding the minimum value from the array
		double min = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}

		// replacing the main diagonal of the array by the minimum value
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					arr[i][j] = min;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		double[][] arr = { { 2.5, 0.5, 3.5 }, { 4.5, 5.5, 6.5 }, { 7.5, 8.5, 9.5 } };

		// print initial array
		System.out.println("Initial Array:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		double[][] newArr = modifyArray(arr);
		// print modified array
		System.out.println("\nModified Array:");
		for (int i = 0; i < newArr.length; i++) {
			for (int j = 0; j < newArr[i].length; j++) {
				System.out.print(newArr[i][j] + " ");
			}
			System.out.println();
		}
	}
}