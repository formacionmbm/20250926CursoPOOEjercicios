package com.javabasico.base.practicas;

import java.io.Serializable;

public class Perfil implements Serializable{

	private static final long serialVersionUID = 1L;
	
	// Construir un Bean Perfil, que tenga como atributos  el identificador  y el nombre
	private int id;
	private String nombre;
<<<<<<< HEAD
	
=======
>>>>>>> refs/heads/solucion
	
	//Constructor defecto
<<<<<<< HEAD
	public Perfil() {
		
	}
=======
	public Perfil() {}

	
>>>>>>> refs/heads/solucion
	
	//Getter//setter
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
<<<<<<< HEAD
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	@Override
	public String toString() {
		return "Perfil [id=" + id + ", nombre=" + nombre + "]";
	}
	
=======
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return "Perfil [id=" + id + ", nombre=" + nombre + "]";
	}
>>>>>>> refs/heads/solucion
	
	
	
	
}
