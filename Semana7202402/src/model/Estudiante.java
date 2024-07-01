package model;

public class Estudiante extends Persona{
	int nota;
	int creditosAprobados;
	
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public int getCreditosAprobados() {
		return creditosAprobados;
	}
	public void setCreditosAprobados(int creditosAprobados) {
		this.creditosAprobados = creditosAprobados;
	}
	
	@Override
	public String mostrarDatosPersona() {
		// TODO Auto-generated method stub
		return "Soy estudiante";
	}
	
	
}
