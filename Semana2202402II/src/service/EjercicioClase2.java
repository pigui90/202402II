package service;

import javax.swing.JOptionPane;

public class EjercicioClase2 {

	public static void main(String[] args) {
		try {

			int opcion = 0;
			double rand;
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite una opcion \n1. Ejericio 1\n2. Ejercicio 2"));

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
				
				JOptionPane.showMessageDialog(null, "Gracias por participar", "Tuanis", JOptionPane.WARNING_MESSAGE);

				break;
			case 2:
				rand = (Math.random()) * 50;
				int numeroAdivinar = (int)rand;
				int numeroUsuario = 0;
				System.out.println(numeroAdivinar);
				
				do {
					numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Adivine el numero entre 1 y 50"));
					if(numeroUsuario != numeroAdivinar) {
						JOptionPane.showMessageDialog(null, "Numero incorrecto", "NO LO ADIVINO", JOptionPane.ERROR_MESSAGE);
					}
				}while(numeroAdivinar != numeroUsuario);
				
				JOptionPane.showMessageDialog(null, "Numero adivinado", "FELICIDADES", JOptionPane.INFORMATION_MESSAGE);

				
				break;
			default:
				break;
			}

		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Debe digitar un numero", "Error", JOptionPane.ERROR_MESSAGE);

		}


	}

}