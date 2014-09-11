package office.methods;

/**
 * Class that implements select method for array sorting
 * @author Maksym Gavlovych (reverff@gmail.com)
 *
 */
public class SelectMethod {
	
	/**
	 * Sorting array with select method
	 * @param array the array
	 * @return sorted array
	 */
	public static int[] doSelectSort(int[] array) {
		final int len = array.length;
		for(int i = 0; i < len - 1; i++) {
			int min = i;
			for(int j = i + 1; j < len; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			if (min != i ) ArrayCommonMethods.swap(array, i, min);
		}
		return array;
	}
}
