package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class MainArchivo {

	public static void main(String[] args) {
		String menu = "1. Leer\n2. Escribir\n3. Guardar Funcionario\n4. Leer Funcionarios\n5. Salir";
		int opcion;
		try {
			File archivo = new File("archivo.txt");
			File funcionarioFile = new File("funcionarios.txt");
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			if (!funcionarioFile.exists()) {
				funcionarioFile.createNewFile();
			}
			do {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

				switch (opcion) {
				case 1:
					FileReader fileReader = new FileReader(archivo);
					BufferedReader br = new BufferedReader(fileReader);
					
					String lineaArchivo = br.readLine();
					String cadena = "";
					int  i = 0;
					while(lineaArchivo != null) {
						i = 0;
						do {
							while(i < lineaArchivo.length() && lineaArchivo.charAt(i) != '|') {
								cadena = cadena + lineaArchivo.charAt(i);
								i++;
							}
							i++;
							JOptionPane.showMessageDialog(null, cadena);
							cadena = "";
						}while(i < lineaArchivo.length());
						lineaArchivo = br.readLine();
					}
					
					break;
				case 2:
					
					FileWriter fileWriter = new FileWriter(archivo, true);
					BufferedWriter bw = new BufferedWriter(fileWriter);
					
					
					
					bw.write(JOptionPane.showInputDialog("Digame una linea para escribir en mi archivo"));
					bw.newLine();
					bw.close();
					
					break;
				case 3:
					break;
				case 4:
					break;
				case 5: 
					JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion no existe");
					break;
				}
			} while (opcion != 5);

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

}
