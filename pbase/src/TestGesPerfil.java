import java.util.ArrayList;
import java.util.List;

import com.javabasico.base.practicas.GesPerfil;
import com.javabasico.base.practicas.Perfil;

public class TestGesPerfil {

	public static void main(String[] args) {
		
		GesPerfil servicio = new GesPerfil();
		
		

		List<Perfil> perfiles = new ArrayList<Perfil>();
		
		System.out.println("Lista de perfiles: " + perfiles);
		
		Perfil perfil1 = new Perfil();
		
		perfil1.setNombre("Usuario");
		
		servicio.save(perfil1);
	}

}
