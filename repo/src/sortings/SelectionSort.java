package sortings;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 5, 3, 1, 8, 6 };
		int temp = 0;
		
		System.out.println("array:before sorting");
		for (int a : arr) {
			System.out.println(a);
		}
		for (int i = 0; i < arr.length - 1; i++) {
			int minvalue = i;
			for (int j=i+1; j < arr.length; j++) {
				if (arr[j] < arr[minvalue]) {
					minvalue = j;

				}
			}
			temp = arr[minvalue];
			arr[minvalue] = arr[i];
			arr[i] = temp;

		}
		System.out.println("array:after sorting");
		for (int a : arr) {
			System.out.println(a);
		}

	}

}
