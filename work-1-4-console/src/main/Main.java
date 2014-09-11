package main;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import office.core.GetArraySort;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) throws IOException {

		System.out.println("Set the array length: ");
		
		scanner = new Scanner(new InputStreamReader(System.in));
		int len = scanner.nextInt();
		int[] array = new int[len];
		
		System.out.println("=========================================");
		for (int i = 0; i<array.length; i++) {
			System.out.println("\nSet the array element #" + (i + 1) + ": ");
			array[i] = scanner.nextInt();
		}

		System.out.println("=========================================\nYour array:");
		for (int i = 0; i<array.length; i++)
			System.out.print("|" + array[i] + "|");
		System.out.println();
		

		
		int [] sortedArray = GetArraySort.quickMethodReverse(array);
		
//		Other methods:		
//		GetArraySort.bubbleMethod(array); 
//		GetArraySort.bubbleMethodReverse(array);
//		GetArraySort.insertMethod(array);
//		GetArraySort.insertMethodReverse(array);
//		GetArraySort.quickMethod(array);
//		GetArraySort.selectMethod(array);
//		GetArraySort.selectMethodReverse(array);
		
		System.out.println("=========================================\nSorted array:");
		for (int i = 0; i<sortedArray.length; i++)
			System.out.print("|" + sortedArray[i] + "|");
		
	}

}
