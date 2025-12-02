package com.javabasico.base.practicas;


//Implementar el código necesario para realizar un CRUD de Perfil.
//Realizar una clase de negocio
//crud es create read update y delete
import java.util.ArrayList;
import java.util.List;

public class GesPerfil {

    // "Base de datos" en memoria
    private List<Perfil> perfiles = new ArrayList<>();

    // CREATE
    public void crear(Perfil perfil) {
        perfiles.add(perfil);
    }

    // READ - obtener por id
    public Perfil obtenerPorId(int id) {
        for (Perfil p : perfiles) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null; // si no existe
    }

    // UPDATE
    public boolean actualizar(Perfil perfilActualizado) {
        for (int i = 0; i < perfiles.size(); i++) {
            Perfil p = perfiles.get(i);
            if (p.getId() == perfilActualizado.getId()) {
                perfiles.set(i, perfilActualizado);
                return true;
            }
        }
        return false;
    }

    // DELETE
    public boolean eliminar(int id) {
        for (int i = 0; i < perfiles.size(); i++) {
            if (perfiles.get(i).getId() == id) {
                perfiles.remove(i);
                return true;
            }
        }
        return false;
    }

    // LISTAR TODOS
    public List<Perfil> listarTodos() {
        return perfiles;
    }
}

