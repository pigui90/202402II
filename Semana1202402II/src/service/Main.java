package service;

import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String nombre = "Sergio";
//		String apellido1 = "Campos";
//		String apellido2 = "Rodriguez";
//		
//		System.out.println("El nombre del profesor es " + nombre + " " + apellido1 + " " + apellido2);
//		System.out.printf("El nombre del profesor es: %1s %2s %3s", nombre, apellido1, apellido2);
//		
//		Date fechaHoy = new Date();
//		
//		System.out.printf("\nLa fecha de hoy es: %1$td-%1$tm-%1$ty", fechaHoy);
//		
		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("\nDigame su edad");
//		int edad = scan.nextInt();
//		
//		String estadoCivil = JOptionPane.showInputDialog("Estado Civil");
//		
//		JOptionPane.showMessageDialog(null, "Su estado civil es: " + estadoCivil);
//		
//		
		System.out.println("Digite opcion \n1 Dividir numeros\n2 Separar letras\n3\n4");
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
				if(!palabra.equals("FIN")) {
					for(int i=0; i<palabra.length();i++) {
						System.out.print(palabra.charAt(i) + " ") ;
					}
				}
				
			}while(!palabra.equals("FIN"));
			break;
		}
	}

}
