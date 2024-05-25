package service;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

/**
 * Esta es la clase Main que va a tener nuestro metodo main que va a ejecutar el
 * programa
 */
public class Main {
	/**
	 * El metodo sirve para ejecutar el programa
	 * 
	 * @param args Es un parametro que usa Java para poder ejecutar el programa
	 */
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		try {

			a = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
			b = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));

			JOptionPane.showMessageDialog(null, "La division de los números es " + (a / b));

		} catch (InputMismatchException ime) {
			// Esta excepcion solo sucede con el Scanner
			JOptionPane.showMessageDialog(null, "El dato no coincide con el Scanner", "Error",
					JOptionPane.ERROR_MESSAGE);
		} catch (NumberFormatException nfe) {
			/**
			 * Esta excepcion es cuando se intenta convertir a un entero} y lo digitado no
			 * es un numero
			 */
			JOptionPane.showMessageDialog(null, "No se puede convertir en numero", "Error", JOptionPane.ERROR_MESSAGE);
		} catch (ArithmeticException ae) {
			// Esta Excepcion
			// es para cuando se quiere dividir
			// entre 0
			JOptionPane.showMessageDialog(null, "No se puede dividir entre 0", "Error", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			// Esta excepcion es por si me falto una en especificar
			JOptionPane.showMessageDialog(null, "Algo fallo y no se que fue", "Error", JOptionPane.ERROR_MESSAGE);
		}

		JOptionPane.showMessageDialog(null, "La suma de los números es " + (a + b));

	}

}
