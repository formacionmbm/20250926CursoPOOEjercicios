import com.javabasico.base.practicas.Casa;

public class TestCasa {

	public static void main(String[] args) {
		
		//Invocamos al constructor Casa(int numHabitaciones, int planta,Float m2);

        Casa casa1 = new Casa(3,3,72.50F);

		//Mostramos por consola la casa

        System.out.println(casa1);

		// En esta clase, no tenemos acceso al constructor Casa(String direccion);
		//porque no somos hermanas ni hay herencia entre nosotras

		//Invocamos al constructor Casa(int numHabitaciones, int planta,);

        Casa casa2 = new Casa(50, 30);

		//Mostramos por consola la casa

        System.out.println(casa2);

		//Modificamos la primera casa con los datos de la segunda casa

        casa1.modificar(casa2);

		//Mostramos por consola las casas

        System.out.println("CASA1: " + casa1 +
                            "\nCASA2: " + casa2);

		//�Que mostrar� primeraCasa==segundaCasa? y �porqu�?

        System.out.println(casa1 == casa2);

		//�Que mostrar� primeraCasa.equals(segundaCasa)? y �porqu�?

        System.out.println(casa1.equals(casa2));
		
		
	}

}
