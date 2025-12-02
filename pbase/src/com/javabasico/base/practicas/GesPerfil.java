package com.javabasico.base.practicas;

//Implementar el código necesario para realizar un CRUD de Perfil. Realizar una clase de negocio
public class GesPerfil  {
	List <Perfil> t_perfil = new ArrayList<Perfil>();
	
	public List  <Perfil> findALL() {
		return this.t_perfil;
	}
	public Perfil insert(Perfil perfil) {
		return perfil;
	}
	public Perfil save(Perfil perfil) {
		return perfil;
	}
	public void deleteById(int id) {
	}
}
