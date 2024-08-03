package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class PrimerPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PrimerPanel() {
		setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel label = new JLabel("");
		add(label);
		
		JLabel lblNewLabel = new JLabel("New label");
		add(lblNewLabel);
		
		JLabel label_1 = new JLabel("");
		add(label_1);
		
		JButton btnNewButton = new JButton("New button");
		add(btnNewButton);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("");
		add(label_2);
		
		JLabel label_3 = new JLabel("");
		add(label_3);
		
		JButton btnNewButton_1 = new JButton("New button");
		add(btnNewButton_1);
		
		JLabel label_4 = new JLabel("");
		add(label_4);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		add(chckbxNewCheckBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		add(rdbtnNewRadioButton);
		
		JLabel label_5 = new JLabel("");
		add(label_5);

	}
}
