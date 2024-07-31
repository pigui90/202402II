package model;

public class Funcionario {
	private String nombre;
	private int edad;
	private String lugarTrabajo;
	
	public Funcionario() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getLugarTrabajo() {
		return lugarTrabajo;
	}

	public void setLugarTrabajo(String lugarTrabajo) {
		this.lugarTrabajo = lugarTrabajo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNombre()+"|"+getEdad()+"|"+getLugarTrabajo();
	}
	
	public String gaurdarDatos(char deli) {
		return getNombre()+deli+getEdad()+deli+getLugarTrabajo();
	}
	
	public String mostrarDatosFuncionario() {
		return "Nombre:_" + getNombre() + "\nEdad:_" + getEdad() + "\nLugar de trabajo:_" + getLugarTrabajo();
	}
}
