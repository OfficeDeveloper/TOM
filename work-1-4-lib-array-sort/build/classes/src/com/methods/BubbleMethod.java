package com.methods;

/**
 * Class that implements bubble sort method
 * @author Maksym Gavlovych (reverff@gmail.com)
 *
 */
public class BubbleMethod {

	/**
	 * Sorting array with bubble method
	 * @param array the array
	 * @return sorted array
	 */
	public static int[] doBubbleSort(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
		    for(int j = 0; j < array.length - i - 1; j++) {
		        if(array[j] > array[j + 1]) {
		            ArrayCommonMethods.swap(array, j, j+1);
		        }
		    }
		}
		return array;
	}
}
