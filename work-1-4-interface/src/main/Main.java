package main;

import java.io.IOException;

import javax.swing.JOptionPane;

import office.core.GetArraySort;

public class Main {


	public static void main(String[] args) throws IOException {

		int len = Integer.parseInt(JOptionPane.showInputDialog("Set the array length:"));
		int[] array = new int[len];
		
		for (int i = 0; i<array.length; i++) {
			array[i] = Integer.parseInt(JOptionPane.showInputDialog("Set the array element #" + (i + 1) + ": "));
		}

		
		
		StringBuffer message = new StringBuffer("Your array:\n");
		for (int i = 0; i<array.length; i++) {
			message.append("|" + array[i] + "|");
			}
		
		int [] sortedArray = GetArraySort.insertMethod(array);
		
//		Other methods:		
//		GetArraySort.bubbleMethod(array); 
//		GetArraySort.bubbleMethodReverse(array);
//		GetArraySort.quickMethodReverse(array);
//		GetArraySort.insertMethodReverse(array);
//		GetArraySort.quickMethod(array);
//		GetArraySort.selectMethod(array);
//		GetArraySort.selectMethodReverse(array);
		
		message.append("\nSorted array:\n");
		for (int i = 0; i<sortedArray.length; i++)
			message.append("|" + sortedArray[i] + "|");
		JOptionPane.showMessageDialog(null, message);
	}

}
