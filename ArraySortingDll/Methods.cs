using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ArraySortingDll
{
    /// <summary>
    /// Class implements methods for sorting arrays. 
    /// </summary>
    public class Methods
    {
        /// <summary>
        /// Changes elements with each other at selected indexes.
        /// </summary>
        /// <param name="array">The array.</param>
        /// <param name="index1">The index1.</param>
        /// <param name="index2">The index2.</param>
        public static void swap(int[] array, int index1, int index2) {
            int buffer = array[index1];
		    array[index1] = array[index2];
		    array[index2] = buffer;
        }

        /// <summary>
        /// Turn array upside down.
        /// </summary>
        /// <param name="array">The array.</param>
        /// <param name="len">The array length.</param>
		public static void reverse(int[] array, int len) {
            int[] buffer;
		    buffer = new int[len];
		    for (int i = 0; i < len; i++)
			    buffer[i] = array[i];
		    for (int i = 0; i < len; i++)
			    array[i] = buffer[len - i - 1];
        }

        /// <summary>
        /// Sorting array with bubble method. 
        /// </summary>
        /// <param name="array">The array.</param>
        /// <param name="len">The array length.</param>
		public static void doBubbleSort(int[] array, int len) {
            for (int i = 0; i < len - 1; i++) {
			    for (int j = 0; j < len - i - 1; j++) {
			    	if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
			    	}
		    	}
	    	}
        }

        /// <summary>
        /// Sorting array with insert method. 
        /// </summary>
        /// <param name="array">The array.</param>
        /// <param name="len">The array length.</param>
		public static void doInsertMethod(int[] array, int len) {
            for (int i = 1; i < len; i++){
			    int current = array[i];
			    int prevKey = i - 1;
		    	while (prevKey >= 0 && array[prevKey] > current){
			    	array[prevKey + 1] = array[prevKey];
			    	array[prevKey] = current;
				    prevKey--;
    		    }
		    }
        }

        /// <summary>
        /// Sorting array with quick method. 
        /// </summary>
        /// <param name="array">The array.</param>
        /// <param name="len">The array length.</param>
		public static void doQuickSort(int[] array, int len) {
            quickSort(array, 0, len-1);
        }

        /// <summary>
        /// Sorting array with select method. 
        /// </summary>
        /// <param name="array">The array.</param>
        /// <param name="len">The array length.</param>
		public static void doSelectSort(int[] array, int len) {
            for (int i = 0; i < len - 1; i++) {
			    int min = i;
			    for (int j = i + 1; j < len; j++) {
			    	if (array[j] < array[min]) {
			    		min = j;
			    	}
			    }
			    if (min != i) swap(array, i, min);
		    }
        }

        /// <summary>
        /// Implementation of quick sort method.
        /// </summary>
        /// <param name="array">The array.</param>
        /// <param name="len">The array length.</param>
		private static void quickSort(int[] array, int lowIndex, int highIndex) {
            int middleIndex = (int) (lowIndex + highIndex) / 2;	
		    int i = lowIndex;
		    int j = highIndex;
		
		    do {
		    	while(array[i] < array[middleIndex]) i++;
		    	while(array[j] > array[middleIndex]) j--;
		    	if (i <= j) {
		    		swap(array, i, j);
		    		i++;
		    		j--;
		    	}
		    } while (i<j);
		    
		    if (lowIndex < j) quickSort(array, lowIndex, j);
		    if (highIndex > i) quickSort(array, i, highIndex);
        }
    }
}
