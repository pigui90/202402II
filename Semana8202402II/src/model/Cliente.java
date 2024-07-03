package model;

import javax.swing.JOptionPane;

public class Cliente {
	int edad;
	String nombreCompleto;
	Profesion profesion;
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public Profesion getProfesion() {
		return profesion;
	}
	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [edad=");
		builder.append(edad);
		builder.append(", nombreCompleto=");
		builder.append(nombreCompleto);
		builder.append(", profesion=");
		builder.append(profesion);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		Cliente cliente = (Cliente)obj;
		JOptionPane.showMessageDialog( null,cliente.toString()
				+"\n\n\n\n"
				+this.toString());
		if(cliente.getEdad()==this.getEdad() 
				&& cliente.getNombreCompleto().equals(this.getNombreCompleto())
				&& cliente.getProfesion().equals(this.getProfesion())) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
