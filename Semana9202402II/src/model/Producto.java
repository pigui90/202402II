package model;

public class Producto {
	int id;
	String codigo;
	String nombre;
	public Producto(int id, String codigo, String nombre) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
	}
	public Producto() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return String.format("Producto [id=%s, codigo=%s, nombre=%s]", id, codigo, nombre);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Producto prod = (Producto) obj;
		return prod.getId() == this.getId();
	}
	
	
}
