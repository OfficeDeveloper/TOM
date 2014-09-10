package main;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) throws IOException {

		System.out.println("Set the array length: ");
		
		scanner = new Scanner(new InputStreamReader(System.in));
		int len = scanner.nextInt();
		int[] array = new int[len];
		
		for (int i = 0; i<array.length; i++) {
			System.out.println("\nSet the array element #" + (i + 1) + ": ");
			array[i] = scanner.nextInt();
		}

		System.out.println();
		for (int i = 0; i<array.length; i++)
			System.out.print("|" + array[i] + "|");
		
		
		
	}

}
