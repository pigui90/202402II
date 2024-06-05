package service;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 * 
 */
public class EjerciciosClase4 {
	/**
	 * Metodo main
	 * 
	 * @param args parametro default
	 */
	public static void main(String[] args) {

		try {
			int opcion = 0;
			do {

				opcion = Integer.parseInt(JOptionPane.showInputDialog(
						"********************\nMenu\n1. Ejercicio 1\n2. Ejercicio 2\n3. Salir\n********************"));

				switch (opcion) {
				case 1:
					int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
					;
					int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));

					int sumaDivisores1 = sumarDivisores(numero1);
					int sumaDivisores2 = sumarDivisores(numero2);

					if (sumaDivisores1 == numero2 && sumaDivisores2 == numero1) {
						JOptionPane.showMessageDialog(null, "Son amiguis");
					} else {
						JOptionPane.showMessageDialog(null, "Son enemiguis");
					}

					break;
				case 2:
					int dia = Integer.parseInt(JOptionPane.showInputDialog("Digame un  dia "));
					int mes = Integer.parseInt(JOptionPane.showInputDialog("Digame un  mes "));
					int anio = Integer.parseInt(JOptionPane.showInputDialog("Digame un  año "));

					String fechaStr = dia + "/" + mes + "/" + anio;
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					Date fecha = sdf.parse(fechaStr);
					Date fechaHoy = new Date();

					if (fecha.compareTo(fechaHoy) < 0) {
						JOptionPane.showMessageDialog(null, "La fecha esta antes de hoy");
					} else {
						if (fecha.compareTo(fechaHoy) == 0) {
							JOptionPane.showMessageDialog(null, "La fecha es igual a hoy");
						} else {
							JOptionPane.showMessageDialog(null, "La fecha esta despues de hoy");
						}
					}

					break;
				case 3: 
					JOptionPane.showMessageDialog(null, "Saliendo del sistema", "Bye!!!", JOptionPane.WARNING_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion Invalida", "Cuidado!!!", JOptionPane.WARNING_MESSAGE);
					break;
				}
			} while (opcion != 3);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!!", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Metodo que suma los divisores
	 * 
	 * @param limite es el numero que se usa para el for
	 * @return devuelve la suma de los divisores
	 */
	public static int sumarDivisores(int limite) {
		int suma = 0;
		for (int i = 1; i < limite; i++) {
			if (limite % i == 0) {
				suma = suma + i;
			}
		}
		return suma;
	}
}
