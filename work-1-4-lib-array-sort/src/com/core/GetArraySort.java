package com.core;

import com.methods.ArrayCommonMethods;
import com.methods.BubbleMethod;
import com.methods.QuickSortMethod;
import com.methods.SelectMethod;

/**
 * Class that defines more convenient methods calls
 * @author Maksym Gavlovych (reverff@gmail.com)
 *
 */
public class GetArraySort {
	
	/**
	 * Sorting array with bubble method from minimum to maximum
	 * @param array the array
	 * @return sorted array
	 */
	public static int[] bubbleMethod(int[] array){
		int[] sortedArray = array.clone();
		BubbleMethod.doBubbleSort(sortedArray);
		return sortedArray;
	}
	
	/**
	 * Sorting array with insert method from minimum to maximum
	 * @param array the array
	 * @return sorted array
	 */
	public static int[] insertMethod(int[] array){
		int[] sortedArray = array.clone();
		insertMethod(sortedArray);
		return sortedArray;
	}
	
	/**
	 * Sorting array with select method from minimum to maximum
	 * @param array the array
	 * @return sorted array
	 */
	public static int[] selectMethod(int[] array){
		int[] sortedArray = array.clone();
		SelectMethod.doSelectSort(sortedArray);
		return sortedArray;
	}
	
	/**
	 * Sorting array with quick method from minimum to maximum
	 * @param array the array
	 * @return sorted array
	 */
	public static int[] quickMethod(int[] array){
		int[] sortedArray = array.clone();
		int highIndex = sortedArray.length - 1;
		QuickSortMethod.doQuickSort(sortedArray, 0, highIndex);
		return sortedArray;
	}
	
	/**
	 * Sorting array with bubble method from maximum to minimum
	 * @param array the array
	 * @return sorted array
	 */
	public static int[] bubbleMethodReverse(int[] array){
		int[] sortedArray = array.clone();
		BubbleMethod.doBubbleSort(sortedArray);
		ArrayCommonMethods.reverse(sortedArray);
		return sortedArray;
	}
	
	/**
	 * Sorting array with insert method from maximum to minimum
	 * @param array the array
	 * @return sorted array
	 */
	public static int[] insertMethodReverse(int[] array){
		int[] sortedArray = array.clone();
		insertMethod(sortedArray);
		ArrayCommonMethods.reverse(sortedArray);
		return sortedArray;
	}
	
	/**
	 * Sorting array with select method from maximum to minimum
	 * @param array the array
	 * @return sorted array
	 */
	public static int[] selectMethodReverse(int[] array){
		int[] sortedArray = array.clone();
		SelectMethod.doSelectSort(sortedArray);
		ArrayCommonMethods.reverse(sortedArray);
		return sortedArray;
	}
	
	/**
	 * Sorting array with quick method from maximum to minimum
	 * @param array the array
	 * @return sorted array
	 */
	public static int[] quickMethodReverse(int[] array){
		int[] sortedArray = array.clone();
		int highIndex = sortedArray.length - 1;
		QuickSortMethod.doQuickSort(sortedArray, 0, highIndex);
		ArrayCommonMethods.reverse(sortedArray);
		return sortedArray;
	}
}
