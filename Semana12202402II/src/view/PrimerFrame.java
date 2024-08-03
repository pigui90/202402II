package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JPasswordField;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JCheckBox;

public class PrimerFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfSaludo;
	private JButton btnSaludar;
	private String nombre;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimerFrame frame = new PrimerFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrimerFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfSaludo = new JTextField();
		tfSaludo.setBounds(139, 72, 86, 20);
		contentPane.add(tfSaludo);
		tfSaludo.setColumns(10);
		
		btnSaludar = new JButton("Saludar");
		btnSaludar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombre = tfSaludo.getText();
				JOptionPane.showMessageDialog(btnSaludar, "Hola: " + nombre);
			}
		});
		btnSaludar.setBounds(23, 104, 89, 23);
		contentPane.add(btnSaludar);
		
		JLabel lblSaludo = new JLabel("Saludo");
		lblSaludo.setBounds(37, 75, 46, 14);
		contentPane.add(lblSaludo);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(139, 135, 46, 32);
		contentPane.add(spinner);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(124, 191, 61, 20);
		contentPane.add(passwordField);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(256, 79, 127, 109);
		contentPane.add(textArea);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SegundoFrame segundoFrame = new SegundoFrame();
				segundoFrame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(23, 232, 89, 23);
		contentPane.add(btnNewButton);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 101, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
		
		JLabel lblValidacion = new JLabel("Este es un error");
		lblValidacion.setForeground(new Color(255, 0, 0));
		lblValidacion.setBounds(116, 292, 180, 14);
		lblValidacion.setVisible(false);
		contentPane.add(lblValidacion);
		JCheckBox chbxValidar = new JCheckBox("Validar");
		chbxValidar.setBounds(116, 266, 97, 23);
		contentPane.add(chbxValidar);
		
		JButton btnValidacion = new JButton("Validacion");
		btnValidacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chbxValidar.isSelected()) {
					lblValidacion.setVisible(true);
					lblValidacion.setText("Algo salio mal");
					lblValidacion.setForeground(new Color(255, 0, 0));

				}else {
					lblValidacion.setVisible(true);
					lblValidacion.setText("Todo ben");

					lblValidacion.setForeground(new Color(0, 255, 0));
				}
				
			}
		});
		btnValidacion.setBounds(23, 266, 89, 23);
		contentPane.add(btnValidacion);
		
		
		
		
	}
}
