package main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import office.core.GetArraySort;
import office.methods.ArrayCommonMethods;


public class UserInterface implements ActionListener {
	
	JFrame frame = new JFrame("Сортування масиву");
	JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JTextArea input = new JTextArea(1,50);
	JTextArea output = new JTextArea(1, 50);
	
	JLabel inputLabel = new JLabel("Введіть масив, розділяючи елементи комою:");
	
	JButton executeButton = new JButton("Сортувати");
	
	JComboBox<String> comboBox = new JComboBox<String>();
	
	JCheckBox toMin = new JCheckBox("За спаданням");
	
	Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);

	public UserInterface() {
		frame.setSize(600, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.setBorder(padding);
		
		frame.add(panel);
		
		panel.add(inputLabel);
		panel.add(input);
		
		comboBox.addItem("Метод бульбашки");
		comboBox.addItem("Метод вибору");
		comboBox.addItem("Метод вставки");
		comboBox.addItem("Метод швидкого сортування");
		panel.add(comboBox);
		
		panel.add(toMin);
		panel.add(output);
		panel.add(executeButton);
		
		executeButton.addActionListener(this);
	}
	
	public void start(){
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String method = (String) comboBox.getSelectedItem();
		String inputString = input.getText();
		
		if (inputString.equals("")) {
			JOptionPane.showMessageDialog(null, "Не введено масив");
			return;
		}
		
		String[] stringArray;
		int[] array;
		try {
			stringArray = inputString.split(",");
			array = new int[stringArray.length];
			for(int i = 0; i < stringArray.length; i++) {
				array[i] = Integer.parseInt(stringArray[i]);
			}
		} catch(Exception exception) {
			JOptionPane.showMessageDialog(null, "Не вірно введено масив");
			return;
		}
		
		if (method.equals("Метод бульбашки")) array = GetArraySort.bubbleMethod(array);
		
		if (method.equals("Метод вибору")) array = GetArraySort.selectMethod(array);
		
		if (method.equals("Метод вставки")) array = GetArraySort.insertMethod(array);
		
		if (method.equals("Метод швидкого сортування")) array = GetArraySort.quickMethod(array);
		
		if (toMin.isSelected()) {
			array = ArrayCommonMethods.reverse(array);
		}
		
		String outputString = String.valueOf(array[0]);
		for(int i = 1; i < array.length; i++) {
			outputString += ",";
			outputString += array[i];
		}
		
		output.setText(outputString);
		
	}
}
