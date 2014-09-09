package com.methods;

/**
 * Class that implements common methods for arrays
 * @author Maksym Gavlovych (reverff@gmail.com)
 *
 */
public class ArrayCommonMethods {
	
	/**
	 * Switches elements in array
	 * @param array the array
	 * @param index1 the first index
	 * @param index2 the second index
	 * @return array with switched elements
	 */
	public static int[] swap(int[] array, int index1, int index2) {
		int buffer = array[index1];
		array[index1] = array[index2];
		array[index2] = buffer;
		return array;
	}
	
	/**
	 * Turn array upside down
	 * @param array the array
	 * @return reversed array
	 */
	public static int[] reverse(int[] array) {
		int[] buffer = array.clone();
		int len = array.length;
		for (int i = 0; i<len; i++)
			array[i] = buffer[len-i-1];
		return array;
	}
}
