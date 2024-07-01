package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import model.Estudiante;
import model.Funcionario;
import model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
			Persona persona = new Persona();

			persona.setEdad(34);
			persona.setFechaNacimiento(new Date());
			persona.setIdentificacion("251252521");
			persona.setResindencia("Tacares");

			Persona persona2 = new Persona();

			persona2.setEdad(25);
			persona2.setFechaNacimiento(new Date());
			persona2.setIdentificacion("251252529");
			persona2.setResindencia("Alajuela");
			JOptionPane.showMessageDialog(null, persona.toString() + "\n" + persona2.toString());
			if (persona.equals(persona2)) {
				JOptionPane.showMessageDialog(null, "Son iguales");
			} else {
				JOptionPane.showMessageDialog(null, "Son diferentes");

			}

			JOptionPane.showMessageDialog(null, persona.toString());

			Funcionario funcionario = new Funcionario();
			funcionario.setGradoAcademico("Licenciado");
			funcionario.setLugarTrabajo("ULATINA");
			JOptionPane.showMessageDialog(null, funcionario.mostrarDatosPersona());

			Estudiante estudiante = new Estudiante();
			estudiante.setNota(100);
			estudiante.setCreditosAprobados(10);

			String identificacion = JOptionPane.showInputDialog("Digame la identificacion");
			String residencia = JOptionPane.showInputDialog("Digame la residencia");
			int edad = Integer.parseInt(JOptionPane.showInputDialog("Digame la edad"));
			Date fechaNacimiento = sdf.parse(JOptionPane.showInputDialog("Digame la fecha de nacimiento"));
			String gradoAcademico = JOptionPane.showInputDialog("Digame la gradoAcademico");
			String lugarTrabajo = JOptionPane.showInputDialog("Digame la lugar trabajo");

			Funcionario funcionario2 = new Funcionario(lugarTrabajo, gradoAcademico, identificacion, edad,
					fechaNacimiento, residencia);
			Funcionario funcionario3 = funcionario;
			JOptionPane.showMessageDialog(null, funcionario2.getIdentificacion());

			JOptionPane.showMessageDialog(null, funcionario2.mostrarDatosPersona());
			JOptionPane.showMessageDialog(null, estudiante.mostrarDatosPersona());

			if (funcionario.equals(funcionario2)) {
				JOptionPane.showMessageDialog(null, "Son iguales");
			} else {
				JOptionPane.showMessageDialog(null, "Son diferentes");

			}
			if (funcionario.equals(funcionario3)) {
				JOptionPane.showMessageDialog(null, "Son iguales");
			} else {
				JOptionPane.showMessageDialog(null, "Son diferentes");

			}
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
	}

}
