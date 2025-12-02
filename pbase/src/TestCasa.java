import com.javabasico.base.practicas.Casa;

public class TestCasa {

	public static void main(String[] args) {
		
		//Invocamos al constructor Casa(int numHabitaciones, int planta,Float m2);
		//Casa casa = new Casa(casa.getNumHabitaciones(), casa.getPlanta(),casa.getM2());
		Casa casa = new Casa(1,8,(float)30.0);
		
		//Mostramos por consola la casa
		 System.out.println("Casa creada: " + casa.getNumHabitaciones() + " habitaciones, Planta "
				 			+ casa.getPlanta() + " y con " + casa.getM2().toString() + " m2." );
		// En esta clase, no tenemos acceso al constructor Casa(String direccion);
		//porque no somos hermanas ni hay herencia entre nosotras
		 
		 /*  ***** Casa casa2 = new Casa("Calle Inventada 4"); ****** */
		 
		//Invocamos al constructor Casa(int numHabitaciones, int planta,);
		 Casa casa2 = new Casa(4, 4);
		
		//Mostramos por consola la casa
		 System.out.println("Casa2 creada: " + casa2.getNumHabitaciones() + " habitaciones, Planta "
		 			+ casa2.getPlanta());
		 
		//Modificamos la primera casa con los datos de la segunda casa
		casa.setNumHabitaciones(casa2.getNumHabitaciones());
		casa.setPlanta(casa2.getPlanta());
		
		//Mostramos por consola las casas
		System.out.println("Casa creada: " + casa.getNumHabitaciones() + " habitaciones, Planta "
	 			+ casa.getPlanta() + " y con " + casa.getM2().toString() + " m2." );
		
		//�Que mostrar� primeraCasa==segundaCasa? y �porqu�? 
		System.out.println(casa == casa2);
		
		
		//�Que mostrar� primeraCasa.equals(segundaCasa)? y �porqu�?
		System.out.println(casa.equals(casa2));
		
		
		
	}

}
