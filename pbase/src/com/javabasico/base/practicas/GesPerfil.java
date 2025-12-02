package com.javabasico.base.practicas;

import java.util.ArrayList;
import java.util.List;

//Implementar el c�digo necesario para realizar un CRUD de Perfil. Realizar una clase de negocio
public class GesPerfil  {

    private List<Perfil> perfiles = new ArrayList<>();// esto es para poder almacenar perfiles, falseando una BBDD
    private long contadorId = 0; // esto es para que la asignacion de ids empiece en 0
	
	public Perfil createPerfil(String nombre){
        Perfil nuevo = new Perfil(contadorId++, nombre);
        perfiles.add(nuevo);
        return nuevo;
    }

    public Perfil getPerfilById(long id){
        for (Perfil p : perfiles){ // esto tendría que meterlo en un try catch
            if(p.getId() == id) return p;
        }
        return null;
    }

    public List<Perfil> getAllPerfiles(){
        return perfiles;
    }

    public boolean updatePerfil(long id, String nuevoNombre){
        Perfil p = getPerfilById(id);
        if(p != null){
            p.setNombre(nuevoNombre);
            return  true;
        }
        return false;
    }

    public boolean deletePerfil(long id){
        return perfiles.removeIf(p -> p.getId() == id);
    }


}
