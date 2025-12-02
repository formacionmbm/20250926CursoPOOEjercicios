package com.javabasico.base.practicas;

import java.util.List;

public class TestGesPerfil {

	
	
	public static void main(String[] args) {
		
		GesPerfil servicio = new GesPerfil();
		
		List<Perfil> perfiles = servicio.findAll();
		
		System.out.println("Lista de perfiles" + perfiles);
		
		Perfil perfilAux = new Perfil();
		perfilAux.setNombre("Usuario");
		servicio.save(perfilAux);
		
		perfilAux = new Perfil();
		perfilAux.setNombre("Administrador");
		servicio.save(perfilAux);
		
		perfiles = servicio.findAll();
		
		System.out.println("Lista de perfiles" + perfiles);
	}

}
