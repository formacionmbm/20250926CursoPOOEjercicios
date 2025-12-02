
import java.util.List;

import com.javabasico.base.practicas.GesPerfil;
import com.javabasico.base.practicas.Perfil;

public class TestGesPerfil {

	
	
	public static void main(String[] args) {
		
		GesPerfil servicio= new GesPerfil();
		
		//Recogemos los perfiles de la BBDD
		List<Perfil> perfiles = servicio.findAll();
		
		System.out.println("Lista de perfiles:"+perfiles);
		
		//Insertamos un perfil 
		
		Perfil perfilAux = new Perfil();
		
		perfilAux.setNombre("Usuario");
		
		servicio.save(perfilAux);
		
		
		//Insertamos otro perfil		
		
		perfilAux = new Perfil();
		
		perfilAux.setNombre("Admin");
		
		servicio.save(perfilAux);
		
		
		//Recogemos los perfiles de la BBDD
		perfiles = servicio.findAll();
		
		System.out.println("Lista de perfiles:"+perfiles);
		
		//System.out.println(servicio.findById(1));  /* Buscar un registro */
		
		//Modificar un registro
		perfilAux.setNombre("Vic");		
		servicio.save(perfilAux);
		System.out.println("Lista de perfiles:"+perfiles);
		
	}
}