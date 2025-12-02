package com.javabasico.base.practicas;

import java.io.Serializable;

public class Perfil implements Serializable{
	private static final long serialVersionUID = 1L;
	
	// Construir un Bean Perfil, que tenga como atributos  el identificador  y el nombre
	
	private long id;
    private String nombre;
	//Constructor defecto

    public Perfil(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }


    //Getter//setter


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
