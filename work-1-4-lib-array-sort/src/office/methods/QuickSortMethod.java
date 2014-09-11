package office.methods;

/**
 * Class that implements quick sort method
 * @author Maksym Gavlovych (reverff@gmail.com)
 *
 */
public class QuickSortMethod {
	
	/**
	 * Quick sorting array
	 * @param array the array
	 * @param lowIndex the first index
	 * @param highIndex the second index
	 * @return sorted array
	 */
	public static int[] doQuickSort(int[] array, int lowIndex, int highIndex) {
		int middleIndex = (int) (lowIndex + highIndex) / 2;	
		int i = lowIndex;
		int j = highIndex;
		
		do {
			while(array[i] < array[middleIndex]) i++;
			while(array[j] > array[middleIndex]) j--;
			if (i <= j) {
				ArrayCommonMethods.swap(array, i, j);
				i++;
				j--;
			}
		} while (i<j);
		
		if (lowIndex < j) doQuickSort(array, lowIndex, j);
		if (highIndex > i) doQuickSort(array, i, highIndex);
				
		return array;
	}
}
