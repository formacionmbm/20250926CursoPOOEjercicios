package com.javabasico.base.practicas;

import java.io.Serializable;

/* Fase inicial de crear un JavaBean (Bean Perfil).
Un JavaBean es simplemente una clase Java que sigue ciertas convenciones para la manipulación de datos.

Aquí tienes el código completo de la clase Perfil implementando el constructor por defecto y los métodos Getter/Setter para los atributos id y name, que son las convenciones clave que te faltan.
 */
public class Perfil implements Serializable{
	// Requisito 1: Atributos privados
		private static final long serialVersionUID = 1L;
		
		private int id;
		private String name;
		
		
		// 1. Constructor por defecto (sin argumentos)
		// Requisito 2: Debe ser público.
		public Perfil() {
			// Constructor vacío, necesario para que sea un JavaBean
		}

		// Opcional: Constructor con todos los atributos para inicialización rápida
	    public Perfil(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }
		
		
		// 2. Métodos Getter y Setter
		// Requisito 3: Los métodos de acceso (get/set) deben ser públicos.
		
		// Getter para id
		public int getId() {
			return id;
		}

		// Setter para id
		public void setId(int id) {
			this.id = id;
		}

		// Getter para name
		public String getName() {
			return name;
		}

		// Setter para name
		public void setName(String name) {
			this.name = name;
		}
		
	    // Opcional: Método toString para una fácil impresión de la información del objeto
	    @Override
	    public String toString() {
	        return "Perfil [id=" + id + ", name=" + name + "]";
	    }
}
