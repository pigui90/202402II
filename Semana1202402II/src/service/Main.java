package service;

import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String nombre = "Sergio";
		String apellido1 = "Campos";
		String apellido2 = "Rodriguez";

		System.out.println("El nombre del profesor es: " + nombre + " " + apellido1 + " " + apellido2);
		System.out.printf("El nombre del profesor es: %1s %2s %3s", nombre, apellido1, apellido2);

		Date fechaHoy = new Date();

		System.out.printf("\nLa fecha de hoy es: %1$td-%1$tm-%1$ty", fechaHoy);

		Scanner scan = new Scanner(System.in);

		System.out.println("\nDigame su edad");
		int edad = scan.nextInt();
		System.out.println("\nLa Edad digitada es: " + edad);


		String estadoCivil = JOptionPane.showInputDialog("Estado Civil");

		JOptionPane.showMessageDialog(null, "Su estado civil es: " + estadoCivil);

		System.out.println("Digite una opcion \n1 Dividir numeros\n2 Separar letras\n3 Operaciones\n4 Saludos");
		int op = scan.nextInt();
		switch (op) {
		case 1:
			int num;
			do {
				System.out.println("Digite un numero");
				num = scan.nextInt();
				if (num != 0) {
					for (int i = 1; i <= num; i++) {
						System.out.println((double) i / num);
					}
				}
			} while (num != 0);
			break;
		case 2:
			String palabra = "";
			do {
				System.out.println("\nIndique una palabra para deletrar");
				palabra = scan.next();
				if (!palabra.equals("FIN")) {
					for (int i = 0; i < palabra.length(); i++) {
						System.out.print(palabra.charAt(i) + " ");
					}
				}

			} while (!palabra.equals("FIN"));
			break;
		case 3:
			System.out.println("Digite un numero");
			double num1 = scan.nextDouble();
			System.out.println("Digite un numero");
			double num2 = scan.nextDouble();
			System.out.printf("La suma de %1.2f + %2.2f = %3.2f\n", num1, num2, (num1 + num2));
			System.out.printf("La resta de %1.2f - %2.2f = %3.2f\n", num1, num2, (num1 - num2));
			System.out.printf("La division de %1.2f / %2.2f = %3.2f\n", num1, num2, (num1 / num2));
			System.out.printf("La la multiplicacion de %1.2f * %2.2f = %3.2f\n", num1, num2, (num1 * num2));
			System.out.printf("La suma de los resultados es %1.2f\n",
					((num1 + num2) + (num1 - num2) + (num1 / num2) + (num1 * num2)));
			break;
		case 4:
			boolean seguir = true;
			String name = "";
			do {
				System.out.println("Digame su nombre para saludarlo");
				name = scan.next();
				JOptionPane.showMessageDialog(null, "Hola!! " + name, "Saludo", JOptionPane.WARNING_MESSAGE);
				System.out.println("Desea continuar?? True/False");
				seguir = scan.nextBoolean();
			} while (seguir);
			JOptionPane.showMessageDialog(null, "Adios!! ", "Despedida", JOptionPane.INFORMATION_MESSAGE);
			break;
		}
		scan.close();
	}

}
