package com.javabasico.base.practicas;


public class Casa { //clase por defecto
	
	//Paso1: Inicializamos las variables de entero: numHabitaciones y planta por defecto a 0.
	private int numHabitaciones = 0; //private porque están los atributos(datos), tipo entero (int) y se inicializa en 0
	private int planta = 0; //private porque están los atributos(datos), tipo entero (int) y se inicializa en 0
	
	//Paso2:  Declaramos una cadena de acceso publica llamada dirección.
	public String direccion = "Sin direccion"; //método público, tipo cadena (String)
	
	//Paso3:  Declaramos y asignamos un objeto privado float para los m2, le damos un valor por defecto.
	private Float m2 = 100f; //tipo float (decimal)
	
	//Paso4:  Declaramos un constructor privado por defecto.
	private Casa() {  //private no se invoca fuera de la clase, () por ser por defecto y sin parámetros
		
	}
	
	//Paso5:  Declaramos un constructor publico con los atributos de tipo primitivo.
	public Casa () {
	     int numHabitaciones = 0;
		 int planta = 0;
	}
	
	//Paso6:  Declarmos un constructor con todos los tipos numericos
	
	//Paso7:  Declaramos un constructor protegido con los datos de cadena
	
	//Paso8:  Declararemos los m�todos de acceso que sean necesarios para los atributos
	
	
	//Paso9:  Declaramos un metodo init sin parametros que invoque al constructor privado
	// y retorne una instancia de objeto
	
	
	//Paso10:  Declaramos un metodo modificar que modifique todos los atributos del objeto
	
	
	
	//Paso11:  Declaramos un metodo modificar que modifique todos los atributos del objeto
	// pas�ndole como par�metro �nicamente otro objeto Casa
	
	
	
	
	//Paso12:  Sobreescribir el m�todo toString para que se muestren los atributos de esta clase
	
}
