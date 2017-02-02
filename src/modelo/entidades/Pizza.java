package modelo.entidades;

import java.util.List;

public class Pizza {

	private String direccion;
	private String nombre;
	private String telefono;
	private List<String> listaIngredientes;
	private String tama�o;
	private double precio;
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public List<String> getListaIngredientes() {
		return listaIngredientes;
	}
	public void setListaIngredientes(List<String> listaIngredientes) {
		this.listaIngredientes = listaIngredientes;
	}
	public String getTama�o() {
		return tama�o;
	}
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Pizza [direccion=" + direccion + ", nombre=" + nombre + ", telefono=" + telefono
				+ ", listaIngredientes=" + listaIngredientes + ", tama�o=" + tama�o + ", precio=" + precio + "]";
	}

	
	
	
}
