package com.methods;

/**
 * Class that implements insert sort method
 * @author Maksym Gavlovych (reverff@gmail.com)
 *
 */
public class InsertMethod {
	
	/**
	 * Sorting array with insert method
	 * @param array the array
	 * @return sorted array
	 */
	public static int[] doInsertMethod(int[] array) {
		for(int i = 1; i < array.length; i++){
	         int current = array[i];
	         int prevKey = i - 1;
	         while(prevKey >= 0 && array[prevKey] > current){
	        	 array[prevKey+1] = array[prevKey];
	        	 array[prevKey] = current;
	             prevKey--; 
	 
	         }  
	     }
		return array;
	}
}
