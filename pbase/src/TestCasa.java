import com.javabasico.base.practicas.Casa;

public class TestCasa {

	public static void main(String[] args) {
		
		//Invocamos al constructor Casa(int numHabitaciones, int planta,Float m2);
		Casa casa1 = new Casa(3, 1, 60.0f);
		
		//Mostramos por consola la casa
		System.out.println("CASA 1 - " + casa1.toString());
		
		// En esta clase, no tenemos acceso al constructor Casa(String direccion);
		//porque no somos hermanas ni hay herencia entre nosotras
		//Casa casa2 = new Casa("Madrid");

		//Invocamos al constructor Casa(int numHabitaciones, int planta,);
		Casa casa3 = new Casa(2, 2);
		
		//Mostramos por consola la casa
		System.out.println("CASA 3 - " + casa3.toString());
		
		//Modificamos la primera casa con los datos de la segunda casa
		casa1.modificar(casa3);
		
		//Mostramos por consola las casas
		System.out.println("CASA 1 - " + casa1.toString());
		System.out.println("CASA 3 - " + casa3.toString());
		
		
		//¿Que mostrara primeraCasa==segundaCasa? y ¿por que?
		System.out.println(casa1==casa3);
		//es falso porque son referencias de memoria diferentes
		System.out.println(casa1.hashCode());
		System.out.println(casa3.hashCode());
		
		//¿Que mostrara primeraCasa.equals(segundaCasa)? y ¿por que?
		System.out.println(casa1.equals(casa3));
		
		
		
	}

}
