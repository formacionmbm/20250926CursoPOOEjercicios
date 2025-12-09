import com.javabasico.base.practicas.Casa;

//Paso1: Incluir el Javadoc de esta clase y sus metodos. Lo mas completo posible
public class TestPracticas {
	//Paso2:  Inicializar una variable tipo Casa de 3 habitaciones y 2 planta.
	Casa casa1 = new Casa(3,2);
	
	//Paso3:  Declarar variables numHabitaciones y planta de tipo entero
	private int numHabitaciones;
	private int planta;
	
	//Paso4:  Crear un metodo main.  Dentro del main del paso 5 al final
	public static void main(String[] args) {
		
		//Paso5:  Inicializar la variable testPracticas del tipo de esta clase
		TestPracticas tp = new TestPracticas();
		
		//Paso6:  Mostrar por consola el objeto casa de testPracticas
		System.out.println(tp.casa1.toString());
		
		//Paso7:  Inicializar las variables nHab y pl con valor 2 y 1 respectivamente
		int nHab = 2;
		int pl = 1;
		
		//Paso8:  Crear un objeto casa "casa" con el valor de las variables locales de metodo
		Casa casa = new Casa(nHab, pl);
		
		//Paso9:  Crear un objeto casa "casa2" con el valor de las variables locales de clase
		Casa casa2 = new Casa(tp.numHabitaciones, tp.planta);
		
		//Paso10:  Mostrar por consola todas las casas
		System.out.println("CASA - " + casa.toString());
		System.out.println("CASA 2 - " + casa2.toString());
		
		//Paso11:  Modificar los datos de la variable casa local a metodo con los valores de la
		// casa de testPracticas
		casa.modificar(tp.casa1);
		
		//Paso12:  Modificar los m2 a 100 de la casa global a toda la clase, usando la variable
		// casa local, sin pasar el objeto
		tp.casa1.setM2(casa.getM2());
		
	    //Paso13:  Mostrar por consola todas las casas
		System.out.println("CASA - " + casa.toString());
		System.out.println("CASA1 TESTPRACTICAS - " + tp.casa1.toString());
		
		
		
		
	}
	
	
	
	

	

}
