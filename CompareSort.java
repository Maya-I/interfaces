package interfaces;

public class CompareSort {
	public static void insertionSort(Object[] array, Comperator comp) {
		int i, j;
		Object temp;
		
		for (i=1; i<array.length; i++) {
			j=i;
			while(j>0 && (comp.compare(array[j],array[j-1])<0)) {
				temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
				j = j-1;
			}
		}

}
}
