package com.javabasico.base.practicas;

import java.io.Serializable;

public class Perfil implements Serializable{
	private static final long serialVersionUID = 1L;
	
	// Construir un Bean Perfil, que tenga como atributos  el identificador  y el nombre
	
	private Integer identificador;
	private String nombre;
	
	//Constructor defecto
	
	public Perfil() {}
	//Getter//setter

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
