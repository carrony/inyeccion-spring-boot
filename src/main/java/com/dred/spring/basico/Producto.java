package com.dred.spring.basico;

import org.springframework.stereotype.Component;

@Component
public class Producto {

	private String nombre;
	private String descripcion;
	private double precio;
	
	public Producto() {
		this.nombre = "";
		this.descripcion = "";
		this.precio = 0;
	}
	
	public Producto(String nombre, String descripcion, double precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + "]";
	}
	
	
}