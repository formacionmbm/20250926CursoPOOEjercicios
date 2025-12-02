import com.javabasico.base.practicas.Casa;

//Paso1: Incluir el Javadoc de esta clase y sus m�todos. Lo m�s completo posible
public class TestPracticas {
	//Paso2:  Inicializar una variable tipo Casa de 3 habitaciones y 2 planta.
	/** Creo un nuevo objeto de tipo casa con el constructor que tiene 2 parametros de de numHabitaciones y plantas **/
	Casa casa = new Casa(3, 2);
	
	//Paso3:  Declarar variables numHabitaciones y planta de tipo entero
	private int numHabitaciones;
	private int planta;
	
	//Paso4:  Crear un m�todo main.  Dentro del main del paso 5 al final
	 public static void main(String[] args) {
		 /** Inicializar la variable testPracticas del tipo de esta clase **/
		//Paso5:  Inicializar la variable testPracticas del tipo de esta clase
		TestPracticas testPracticas=new TestPracticas();
		
		//Paso6:  Mostrar por consola el objeto casa de testPracticas
		System.out.println(testPracticas.casa);
		
		//Paso7:  Inicializar las variables nHab y pl con valor 2 y 1 respectivamente
		testPracticas.numHabitaciones=2;
		testPracticas.planta=1;
		
		//Paso8:  Crear un objeto casa "casa" con el valor de las variables locales de metodo
		Casa casa1 = new Casa(testPracticas.getNumHabitaciones(),testPracticas.getPlanta());
		
		//Paso9:  Crear un objeto casa "casa2" con el valor de las variables locales de clase
		Casa casa2 = new Casa(testPracticas.numHabitaciones, testPracticas.planta);
		
		//Paso10:  Mostrar por consola todas las casas
		System.out.println(casa1);
		System.out.println(casa2);
		
		//Paso11:  Modificar los datos de la variable casa local a metodo con los valores de la
		// casa de testPracticas
		casa1.modificar(testPracticas.casa);
		
		//Paso12:  Modificar los m2 a 100 de la casa global a toda la clase, usando la variable
		// casa local, sin pasar el objeto
		
		
	    //Paso13:  Mostrar por consola todas las casas
		System.out.println();
		System.out.println(testPracticas.casa);
		System.out.println(casa1);
		System.out.println(casa2);
		
	}

	 public int getNumHabitaciones() {
		 return numHabitaciones;
	 }

	 public void setNumHabitaciones(int numHabitaciones) {
		 this.numHabitaciones = numHabitaciones;
	 }

	 public int getPlanta() {
		 return planta;
	 }

	 public void setPlanta(int planta) {
		 this.planta = planta;
	 }
	
	
	
	 
	 
	
	
	
	
	
	
	
	

	

}
