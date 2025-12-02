package com.javabasico.base.practicas;


public class Casa {
	//Paso1: Inicializamos las variables de entero: numHabitaciones y planta por defecto a 0
	
	int numeroHabitaciones = 0; //numero de habitaciones empieza por 0
	int planta = 0;	//planta por defecto 0
	
	//Paso2:  Declaramos una cadena de acceso publica llamada direcci�n
	
	public String direccion;
	
	//Paso3:  Declaramos y asignamos un objeto privado float para los m2, le damos un valor
	// por defecto
	
	private float m2 = 120.0f; //Objeto privado de tipo float para los m2 de la casa
	
	//Paso4:  Declaramos un constructor privado por defecto
	
	private Casa() {
		
	};
	
	//Paso5:  Declaramos un constructor publico con los atributos de tipo primitivo
	
	public Casa (int numeroHabitaciones, int planta) {
		this.numeroHabitaciones = numeroHabitaciones;
		this.planta = planta;
	}
	
	
	//Paso6:  Declarmos un constructor con todos los tipos numericos
	
	public Casa (int numeroHabitaciones, int planta, float m2) {
		this.numeroHabitaciones = numeroHabitaciones;
		this.planta = planta;
		this.m2 = m2;
	}
	
	//Paso7:  Declaramos un constructor protegido con los datos de cadena
	
	protected Casa(String direccion) {
		this.direccion = direccion;
	}

	
	
	//Paso8:  Declararemos los m�todos de acceso que sean necesarios para los atributos
	
	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public void setNumeroHabitaciones(int numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public float getM2() {
		return m2;
	}

	public void setM2(float m2) {
		this.m2 = m2;
	}
	
	//Paso9:  Declaramos un metodo init sin parametros que invoque al constructor privado
	// y retorne una instancia de objeto
	
	// Método init sin parámetros que invoca al constructor privado
	public static Casa init() {
		return new Casa(); // retorna una nueva instancia usando el constructor privado
	}
			
	//Paso10:  Declaramos un metodo modificar que modifique todos los atributos del objeto
	
	public void modificar(int numeroHabitaciones, int planta, float m2, String direccion) {
		this.numeroHabitaciones = numeroHabitaciones;
		this.planta = planta;
		this.m2 = m2;
		this.direccion = direccion;
	}
	
	//Paso11:  Declaramos un metodo modificar que modifique todos los atributos del objeto
	// pas�ndole como par�metro �nicamente otro objeto Casa
	
	public void modificar(Casa2) {
		this.numeroHabitaciones = numeroHabitaciones
				this
	}
	
	
	//Paso12:  Sobreescribir el m�todo toString para que se muestren los atributos de esta clase
	
}
