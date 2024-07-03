package service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Examen {
	public static void main(String[] args) {
		try {
			boolean salir = true;
			int opcion = 0;
			int numero1;
			int numero2;
			String divisibles = "";
			int contador=0;
			do {
				opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Ejercicio 1 \n2. Ejercicio 2\n3. Salir"));

				switch (opcion) {
				case 1:
					contador = 0;
					do {
						numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1"));
						numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 2"));
					} while (numero1<= numero2);
					for (int i = numero2 + 1; i < numero1; i++) {
						if(i%5==0) {
							divisibles = divisibles + i + " ";
							contador++;
						}
					}
					JOptionPane.showMessageDialog(null,"Los divisibles son "+ divisibles);
					JOptionPane.showMessageDialog(null, "El total es: " + contador);

					break;
				case 2:
					contador = 0;
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					String fecha1 = JOptionPane.showInputDialog("Ingrese una fecha formato dd/MM/yyyy ");
					Date fechaInicio = sdf.parse(fecha1);
					Date fechaFinal;
					do {
						String fecha2 = JOptionPane.showInputDialog("Ingrese otra fecha formato dd/MM/yyyy");
						fechaFinal = sdf.parse(fecha2);
						
					}while(fechaFinal.compareTo(fechaInicio) <= 0);
					
					LocalDate ldFechaInicio = fechaInicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
					LocalDate ldFechaFinal = fechaFinal.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

					do {
						contador++;
						ldFechaInicio = ldFechaInicio.plusDays(1);
					}while(ldFechaInicio.compareTo(ldFechaFinal) <= 0);
					
					JOptionPane.showMessageDialog(null, "La cantidad de dias son: " + contador);
					
					break;
				case 3:
					break;
				default:
					break;
				}

			} while (!salir);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
