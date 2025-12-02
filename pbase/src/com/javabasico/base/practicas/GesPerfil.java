package com.javabasico.base.practicas;

import java.util.ArrayList;
import java.util.List;

//Implementar el c�digo necesario para realizar un CRUD de Perfil. Realizar una clase de negocio
public class GesPerfil  {
	
	List<Perfil> t_perfil = new ArrayList<Perfil>();
	int contador;
	
	
   public List<Perfil> findAll(){
	   
	   return this.t_perfil;
   }
   
   public Perfil findById(int id) {
	   for(Perfil perfil: this.t_perfil) {
		   if(perfil.getId()==id) return perfil;
	   }
	   
	   return null;
   }   
   
   public Perfil save(Perfil perfil) {
	   if(perfil.getId()==0) {
		   //insercion
		   contador++;
		   perfil.setId(contador);
		   this.t_perfil.add(perfil);
	   }else {
		   //modificacion
		   for(Perfil perfilAux: this.t_perfil) {
			   if(perfilAux.getId()==perfil.getId()) 
				   perfilAux.setNombre(perfil.getNombre());			     
		   } 
	   }
	   
	   return perfil;
	   
   }
   public void deleteById(int id) {
	   int posicion=-1;
	   for(Perfil perfil: this.t_perfil) {
		   if(perfil.getId()==id) {
			    posicion = this.t_perfil.indexOf(perfil);
		   }
	   }
	   this.t_perfil.remove(posicion);
	   
   }
	
	
	

}
