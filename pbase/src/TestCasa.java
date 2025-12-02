import com.javabasico.base.practicas.Casa;

public class TestCasa {

	public static void main(String[] args) {
		
		//Invocamos al constructor Casa(int numHabitaciones, int planta,Float m2);
		Casa casa1= new Casa(5, 3, 100.0f);
		casa1.direccion="Calle del sol, 10";
		
		//Mostramos por consola la casa
		System.out.println(casa1);
		// En esta clase, no tenemos acceso al constructor Casa(String direccion);
		//porque no somos hermanas ni hay herencia entre nosotras

		//Invocamos al constructor Casa(int numHabitaciones, int planta,);
		
		//Mostramos por consola la casa
		
		//Modificamos la primera casa con los datos de la segunda casa
		
		//Mostramos por consola las casas
		
		//�Que mostrar� primeraCasa==segundaCasa? y �porqu�?
		//�Que mostrar� primeraCasa.equals(segundaCasa)? y �porqu�?
		
		
		
		
	}

}
