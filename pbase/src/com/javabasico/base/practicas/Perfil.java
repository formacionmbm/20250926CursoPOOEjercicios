package com.javabasico.base.practicas;

import java.io.Serializable;

public class Perfil implements Serializable{
	private static final long serialVersionUID = 1L;
	
	// Construir un Bean Perfil, que tenga como atributos  el identificador  y el nombre
	
	private int id;
	private String nombre;
	
	//Constructor defecto
	
	public Perfil() {}
	
	//Getter//setter
	
	public String getNombre() {
		return nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
