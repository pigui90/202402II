package service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javax.swing.JOptionPane;

public class Tarea1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = Integer.parseInt(JOptionPane.showInputDialog(
				"1 Ejercio 1\n2 Ejercicio 2 \n3 Ejercicio 3\n4 Ejercicio 4 \n5 Ejercicio 5\n6 Ejercicio 6\n7 Ejercicio 7"));

		switch (opcion) {
		case 1:
			try {
				String palabra;
				do {
					palabra = JOptionPane.showInputDialog("Digame una palabra");
				} while (palabra.length() < 3);
				String deletreado = "";
				for (int i = 0; i < palabra.length(); i++) {
					deletreado = deletreado + palabra.charAt(i) + " ";
				}
				deletreado = deletreado + " <-> ";
				for (int i = palabra.length() - 1; i >= 0; i--) {
					deletreado = deletreado + palabra.charAt(i) + " ";
				}

				JOptionPane.showMessageDialog(null, deletreado);

				int min = 0;
				int max = palabra.length() - 1;
				boolean esPalindromo = true;

				while (min <= max) {
					if (palabra.charAt(min) != palabra.charAt(max)) {
						JOptionPane.showMessageDialog(null, "No es palindromo, Son diferentes en las letras "
								+ palabra.charAt(min) + " y " + palabra.charAt(max));
						esPalindromo = false;
						break;

					}
					min++;
					max--;
				}

				if (esPalindromo) {
					JOptionPane.showMessageDialog(null, "Es Palindromo");
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error");
			}
			break;
		case 2:

			try {
				int numero;

				do {
					numero = Integer.parseInt(JOptionPane.showInputDialog("Digame un numero"));

				} while (numero < 1 || numero > 99);

				int contador = 0;
				String resultado = "";
				for (int i = numero - 1; i >= 1; i--) {
					if (numero % i == 0) {
						resultado = resultado + i + " ";
						contador++;
						if (contador % 5 == 0) {
							resultado = resultado + "\n";
						}
					}

				}
				JOptionPane.showMessageDialog(null, resultado);

			} catch (Exception exception) {
				JOptionPane.showMessageDialog(null, exception.getMessage());

			}

			break;

		case 3:
			LocalDate hoyLD = LocalDate.now();

			try {
				int dias = 0;
				do {
					dias = Integer.parseInt(JOptionPane.showInputDialog("Digame un numero"));
				} while (dias < 1 || dias > 365);
				Date fechaLDPlus = Date.from(hoyLD.plusDays(dias).atStartOfDay(ZoneId.systemDefault()).toInstant());
				Date fechaLDMinus = Date.from(hoyLD.minusDays(dias).atStartOfDay(ZoneId.systemDefault()).toInstant());
				SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-YYYY");
				SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/YYYY");
				JOptionPane.showMessageDialog(null, sdf.format(fechaLDMinus));
				JOptionPane.showMessageDialog(null, sdf2.format(new Date()));
				JOptionPane.showMessageDialog(null, sdf.format(fechaLDPlus));
				

			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());

			}

			break;
		case 4:

			try {
				int year = 0;
				do {
					year = Integer.parseInt(JOptionPane.showInputDialog("Digame un numero de 4 digitos"));
				} while (year < 1000 || year > 9999);

				if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
					JOptionPane.showMessageDialog(null, "El año es bisiesto");
				} else {
					JOptionPane.showMessageDialog(null, "El año no es bisiesto");
				}

				boolean bisiesto = false;
				int yearAnterior = year - 1;
				int yearPosterior = year + 1;
				do {
					if ((yearAnterior % 4 == 0 && yearAnterior % 100 != 0)
							|| (yearAnterior % 100 == 0 && yearAnterior % 400 == 0)) {
						bisiesto = true;
					} else {
						yearAnterior--;
					}
				} while (!bisiesto);
				bisiesto = false;
				do {
					if ((yearPosterior % 4 == 0 && yearPosterior % 100 != 0)
							|| (yearPosterior % 100 == 0 && yearPosterior % 400 == 0)) {
						bisiesto = true;
					} else {
						yearPosterior++;
					}
				} while (!bisiesto);

				JOptionPane.showMessageDialog(null,
						"El bisiesto anterior es: " + yearAnterior + " y el siguiente es " + yearPosterior);

			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());

			}
			break;

		case 5:
			try {
				int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digame un numero "));
				int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digame otro numero "));
				
				JOptionPane.showMessageDialog(null, divisionNumeros(numero1, numero2));
				JOptionPane.showMessageDialog(null, divisionNumeros(numero2, numero1));

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			break;
		case 6:
			
			String clave = "";
			int intentos = 0;
			
			do {
				clave = JOptionPane.showInputDialog(null, "Digame la clave");
				if(clave.equals("Eureka")) {
					JOptionPane.showMessageDialog(null, "Adivino la clave");
					break;
				}else {
					intentos++;
					if(intentos == 3) {
						JOptionPane.showMessageDialog(null, "Ya agoto los intentos");
					}
				}
			}while(intentos <3);
			
			break;
		case 7:
			for (int i = 1; i <= 9; i++) {
				System.out.println("El cuadrado del numero es: " + (i*i));
				
			}
		default:
			break;
		}
	}

	public static double divisionNumeros(int num1, int num2) {
		return (double) num1 / num2;
	}

}
