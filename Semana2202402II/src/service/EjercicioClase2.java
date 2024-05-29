package service;

import javax.swing.JOptionPane;

/**
 * Esta clase contiene los ejercicios de la clase 2 de Programacion II
 */
public class EjercicioClase2 {

	/**
	 * Este metodo contiene la logica de los 4 ejercicios de la clase donde se
	 * vieron las Excepcion
	 * 
	 * @param args Parametro por defecto del metodo main que usa JAVA
	 */
	public static void main(String[] args) {
		try {

			int opcion = 0;
			double rand;
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite una opcion \n1. Ejericio 1\n2. Ejercicio 2\n3. Ejercicio 3\n4. Ejercicio 4"));

			switch (opcion) {
			case 1:

				int numero = 0;
				boolean incorrecto = true;
				numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
				while (incorrecto) {
					if (numero > 0) {
						incorrecto = false;
					} else {
						JOptionPane.showMessageDialog(null, "El numero debe ser mayor a 0", "Error",
								JOptionPane.ERROR_MESSAGE);
						incorrecto = true;
						numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

					}
				}

				if (numero % 2 == 0) {
					JOptionPane.showMessageDialog(null, "El numero es par", "¡ES PAR!",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "El numero es impar");
				}
				break;
			case 2:
				rand = (Math.random()) * 50;
				int numeroAdivinar = (int) rand;
				int numeroUsuario = 0;
				System.out.println(numeroAdivinar);

				do {
					numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Adivine el numero entre 1 y 50"));
					if (numeroUsuario != numeroAdivinar) {
						JOptionPane.showMessageDialog(null, "Numero incorrecto", "NO LO ADIVINO",
								JOptionPane.ERROR_MESSAGE);
					}
				} while (numeroAdivinar != numeroUsuario);

				JOptionPane.showMessageDialog(null, "Numero adivinado", "FELICIDADES", JOptionPane.INFORMATION_MESSAGE);

				break;
			case 3:

				int num1 = 0;
				int num2 = 0;
				double resultado;
				num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
				num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero que va a ser el divisor"));

				resultado = num1 / num2;
				JOptionPane.showMessageDialog(null, "El resultado de la division es " + resultado);

				break;
			case 4:
				int filas;// Cantidad de Estudiantes
				int columnas; // Cantidad de Calificaciones
				int calificacion = 0;
				filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes"));
				columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de calificaciones"));

				int[][] calificaciones = new int[filas][columnas];
				// int notas[][] = new int[filas][columnas];

				for (int i = 0; i < filas; i++) {// con este recorro las filas
					for (int j = 0; j < columnas; j++) { // con este recorro las columnas de cada fila
						calificacion = Integer.parseInt(JOptionPane.showInputDialog(
								"Ingrese la calificacion #" + ( j + 1) + "  para el estudiante #" + (i + 1)));
						calificaciones[i][j] = calificacion;
					}
				}

				String contenido = "";
				for (int i = 0; i < filas; i++) {// con este recorro las filas
					for (int j = 0; j < columnas; j++) { // con este recorro las columnas de cada fila
						contenido = contenido + calificaciones[i][j] + " ";
					}
					contenido = contenido + "\n";
				}

				JOptionPane.showMessageDialog(null, contenido);

				break;

			default:
				break;
			}

		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Debe digitar un numero", "Error", JOptionPane.ERROR_MESSAGE);

		} catch (ArithmeticException ae) {
			JOptionPane.showMessageDialog(null, "Error de aritmetica", "Error", JOptionPane.ERROR_MESSAGE);
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			JOptionPane.showMessageDialog(null, "Error al acceder a la matriz", "Error", JOptionPane.ERROR_MESSAGE);

		}

		JOptionPane.showMessageDialog(null, "Gracias por participar", "Tuanis", JOptionPane.WARNING_MESSAGE);

	}

}
