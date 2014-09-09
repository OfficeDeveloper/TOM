package com.core;

/**
 * Class for run and testing lib
 * @author Maksym Gavlovych (reverff@gmail.com)
 *
 */
@Deprecated
public class TestRun {
	/**
	 * Main method
	 * @param args the args
	 */
	public static void main(String[] args) {
		System.out.println("bitch.");
		System.out.println();
		
		int[] mas = {5,7,22,8,13,3,1,12,1,0,17,44,23,19,8};
		
		int[] a = new int[mas.length];
		for (int i = 0; i < a.length; i++)
			a[i]=mas[i];
		int[] b = new int[mas.length];
		for (int i = 0; i < a.length; i++)
			b[i]=mas[i];
		
		System.out.println("input:");
		for (int i = 0; i < a.length; i++) System.out.print("|"+b[i]+"|");

		System.out.println();
		System.out.println("quick:");
		a = ArraySort.quickMethod(b);
		for (int i = 0; i < a.length; i++) System.out.print("|"+b[i]+"|");
		System.out.println();
		for (int i = 0; i < a.length; i++) System.out.print("|"+a[i]+"|");
		
		System.out.println();
		System.out.println("reverse-quick:");
		a = ArraySort.quickMethodReverse(b);
		for (int i = 0; i < a.length; i++) System.out.print("|"+b[i]+"|");
		System.out.println();
		for (int i = 0; i < a.length; i++) System.out.print("|"+a[i]+"|");
		
		
	}

}
