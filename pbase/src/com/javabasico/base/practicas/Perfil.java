package com.javabasico.base.practicas;

import java.io.Serializable;

public class Perfil implements Serializable{
	private static final long serialVersionUID = 1L;
	
	// Construir un Bean Perfil, que tenga como atributos  el identificador  y el nombre
	private int identificador;
	private String nombre;
	
	//Constructor defecto
	public Perfil() {}
	
	//Getter//setter
	public int getIdentificador() {
		return identificador;
}
	public String getNombre() {
		return nombre;
	}
	
	public void setIdentificador(int identificador) {
		this.identificador=identificador;

	}
	public void setNombre(String nombre) {
		this.nombre=nombre;		
	}
	
	
	
	
	
}
