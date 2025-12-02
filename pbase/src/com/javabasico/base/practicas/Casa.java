package com.javabasico.base.practicas;


public class Casa {
	//Paso1: Inicializamos las variables de entero: numHabitaciones y planta por defecto a 0
	
	private int numHabitaciones;
	private int planta;
	
	//Paso2:  Declaramos una cadena de acceso publica llamada dirección
	
	public String direccion;
	
	//Paso3:  Declaramos y asignamos un objeto privado float para los m2, le damos un valor
	// por defecto
	
	private float m2= 0f;

	
	//Paso4:  Declaramos un constructor privado por defecto
	private Casa() {	
	}
	
	//Paso5:  Declaramos un constructor público con los atributos de tipo primitivo
	public Casa(int numHabitaciones, int planta, float m2) {
		this.numHabitaciones = numHabitaciones;
		this.planta = planta;
		this.m2=m2;
	}
	
	//Paso6:  Declarmos un constructor con todos los tipos numericos
	public Casa(int numHabitaciones, int planta, Float m2) {
		this.numHabitaciones = numHabitaciones;
		this.planta = planta;
		this.m2 = m2;
	}
	
	//Paso7:  Declaramos un constructor protegido con los datos de cadena
	
	protected Casa(String direccion) {
		this.direccion = direccion;
	}
	//Paso8:  Declararemos los métodos de acceso que sean necesarios para los atributos

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

	public float getM2() {
		return m2;
	}

	public void setM2(float m2) {
		this.m2 = m2;
	}
	
	
	//Paso9:  Declaramos un metodo init sin parametros que invoque al constructor privado
	// y retorne una instancia de objeto
	public static Casa init() {
		return new Casa();
	}

	//Paso10:  Declaramos un metodo modificar que modifique todos los atributos del objeto
	
	public void modificar(int numHabitaciones, int planta, String direccion,  float m2) {
		this.numHabitaciones = numHabitaciones;
		this.planta = planta;
		this.direccion = direccion;
		this.m2 = m2;
	}
	
	//Paso11:  Declaramos un metodo modificar que modifique todos los atributos del objeto
	// pasándole como parámetro  únicamente otro objeto Casa
	
	public void modificar(Casa otraCasa) {
		this.numHabitaciones = otraCasa.numHabitaciones;
		this.planta = otraCasa.planta;
		this.direccion = otraCasa.direccion;
		this.m2 = otraCasa.m2;
	}
	
	
	//Paso12:  Sobreescribir el método toString para que se muestren los atributos de esta clase
	
	@Override
	public String toString() {
		return "Casa [" + "numHabitaciones=" + numHabitaciones + ", planta=" + planta + ", direccion='" + direccion + '\'' + ", m2=" + m2 + "]";
	}
	
}
