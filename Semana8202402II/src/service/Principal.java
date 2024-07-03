package service;

import javax.swing.JOptionPane;

import model.Cliente;
import model.Profesion;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesion profesion = new Profesion();
		profesion.setCarrera("Inge");
		profesion.setCodigo(123);
		profesion.setNombre("Info");
		Profesion profesion2 = new Profesion();
		profesion2.setCarrera("Inge");
		profesion2.setCodigo(456);
		profesion2.setNombre("Info");
		Cliente cliente = new Cliente();
		cliente.setEdad(25);
		cliente.setNombreCompleto("Sergio");
		cliente.setProfesion(profesion);
		Cliente cliente2 = new Cliente();
		cliente2.setEdad(30);
		cliente2.setNombreCompleto("Marcos Vinicio");
		cliente2.setProfesion(profesion2);
		Cliente cliente3 = new Cliente();
		cliente3.setEdad(25);
		cliente3.setNombreCompleto("Sergio");
		cliente3.setProfesion(profesion);
		
		
		if(cliente2.equals(cliente)) {
			JOptionPane.showMessageDialog( null,"SON IGUALES");
		}else {
			JOptionPane.showMessageDialog( null,"SON DIFERENTES");
		}
		
		if(cliente.equals(cliente3)) {
			JOptionPane.showMessageDialog( null,"SON IGUALES");
		}else {
			JOptionPane.showMessageDialog( null,"SON DIFERENTES");
		}
		
		cliente2 = cliente;
		
		if(cliente2.equals(cliente)) {
			JOptionPane.showMessageDialog( null,"SON IGUALES");
		}else {
			JOptionPane.showMessageDialog( null,"SON DIFERENTES");
		}
		
		if(profesion.equals(profesion2)) {
			JOptionPane.showMessageDialog( null,"SON IGUALES");
		}else {
			JOptionPane.showMessageDialog( null,"SON DIFERENTES");
		}
	}

}
