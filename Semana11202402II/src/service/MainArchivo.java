package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Funcionario;

public class MainArchivo {

	public static void main(String[] args) {
		String menu = "1. Leer\n2. Escribir\n3. Guardar Funcionario\n4. Leer Funcionarios\n5. Salir";
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		Funcionario fun;
		int i;
		int opcion = 0;
		try {
			File archivo = new File("archivo.txt");
			//String nombreArchivoFuncionario = "funcionarios.txt";
			String nombreArchivoFuncionario = JOptionPane.showInputDialog("Indique el nombre del archivo con su extension");

			File funcionarioFile = new File(nombreArchivoFuncionario);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			if (!funcionarioFile.exists()) {
				funcionarioFile.createNewFile();
			}
			do {
				try {

					opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

					switch (opcion) {
					case 1:
						FileReader fileReader = new FileReader(archivo);
						BufferedReader br = new BufferedReader(fileReader);

						String lineaArchivo = br.readLine();
						String cadena = "";
						i = 0;
						while (lineaArchivo != null) {
							i = 0;
							do {
								while (i < lineaArchivo.length() && lineaArchivo.charAt(i) != '|') {
									cadena = cadena + lineaArchivo.charAt(i);
									i++;
								}
								i++;
								JOptionPane.showMessageDialog(null, cadena);
								cadena = "";
							} while (i < lineaArchivo.length());
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
						char delim = JOptionPane.showInputDialog("Indiqueme el delimitador a usar").charAt(0);
						fun = new Funcionario();
						fun.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Indique la edad del funcionario")));
						fun.setLugarTrabajo(JOptionPane.showInputDialog("Indique el lugar de trabajo"));
						fun.setNombre(JOptionPane.showInputDialog("Indique el nombre del funcionario"));
						FileWriter fw = new FileWriter(funcionarioFile, true);
						BufferedWriter bwFun = new BufferedWriter(fw);
						bwFun.write(fun.gaurdarDatos(delim));
						bwFun.newLine();
						bwFun.close();

						break;
					case 4:
						char delimitador = JOptionPane.showInputDialog("Indiqueme el delimitador a usar").charAt(0);
						funcionarios = new ArrayList<Funcionario>();
						FileReader fr = new FileReader(funcionarioFile);
						BufferedReader brFun = new BufferedReader(fr);
						String lineaFuncionario = brFun.readLine();
						String nombre = "";
						String edad = "";
						String lugarTrabajo = "";
						i = 0;
						while (lineaFuncionario != null) {
							fun = new Funcionario();
							i = 0;
							do {
								// Leer el nombre del funcionario
								while (lineaFuncionario.charAt(i) != delimitador) {
									nombre = nombre + lineaFuncionario.charAt(i);
									i++;
								}
								i++;
								fun.setNombre(nombre);
								nombre = "";

								// Leer la edad del funcionario
								while (lineaFuncionario.charAt(i) != delimitador) {
									edad = edad + lineaFuncionario.charAt(i);
									i++;
								}
								i++;
								fun.setEdad(Integer.parseInt(edad));
								edad = "";

								// Leer el lugar de trabajo del funcionario
								while (i < lineaFuncionario.length()) {
									lugarTrabajo = lugarTrabajo + lineaFuncionario.charAt(i);
									i++;
								}
								i++;
								fun.setLugarTrabajo(lugarTrabajo);
								lugarTrabajo = "";
							} while (i < lineaFuncionario.length());
							funcionarios.add(fun);
							lineaFuncionario = brFun.readLine();
						}

						for (Funcionario funcionario : funcionarios) {
							// if (funcionario.getNombre().equals("Sergio")) {
							JOptionPane.showMessageDialog(null, funcionario.mostrarDatosFuncionario());
							// }
						}
						break;
					case 5:
						JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opcion no existe");
						break;
					}

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				} catch (StringIndexOutOfBoundsException e) {
					JOptionPane.showMessageDialog(null, "El delimitador indicado no es correcto", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			} while (opcion != 5);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

}
