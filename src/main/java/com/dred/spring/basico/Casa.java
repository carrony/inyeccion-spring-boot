package com.dred.spring.basico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Casa {
	private String direccion;
	private Persona propietario;
	
	public Casa() {
	}
	
	@Autowired
	public Casa(@Value("una direccion") String direccion, Persona propietario) {
		super();
		this.direccion = direccion;
		this.propietario = propietario;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Persona getPropietario() {
		return propietario;
	}
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	@Override
	public String toString() {
		return "Casa [direccion=" + direccion + ", propietario=" + propietario + "]";
	}
	
	
	
	
}
