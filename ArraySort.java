package interfaces;

public class ArraySort {

	public static void insertionSort(int[] array) {
		int i, j, temp;
		for (i=1 ; i<array.length ; i++) {
			j=i;
			while (j>0 && array[j]<array[j-1]) {
				temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
				j = j-1;
			}
		}
	}
}
