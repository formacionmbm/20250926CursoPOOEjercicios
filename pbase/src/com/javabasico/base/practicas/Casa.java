package com.javabasico.base.practicas;


public class Casa {
	//Paso1: Inicializamos las variables de entero: numHabitaciones y planta por defecto a 0
	private int numHabitaciones = 0;
	private int planta = 0;
	
	
	//Paso2:  Declaramos una cadena de acceso publica llamada direccion
	public String direccion;
	
	
	//Paso3:  Declaramos y asignamos un objeto privado float para los m2, le damos un valor
	// por defecto
	private Float m2 = 0.0f;

	
	//Paso4:  Declaramos un constructor privado por defecto
	private Casa() {}

	
	//Paso5:  Declaramos un constructor publico con los atributos de tipo primitivo
	public Casa(int numHabitaciones, int planta) {
		super();
		this.numHabitaciones = numHabitaciones;
		this.planta = planta;
	}

	
	//Paso6:  Declaramos un constructor con todos los tipos numericos
	public Casa(int numHabitaciones, int planta, Float m2) {
		super();
		this.numHabitaciones = numHabitaciones;
		this.planta = planta;
		this.m2 = m2;
	}

	
	//Paso7:  Declaramos un constructor protegido con los datos de cadena
	protected Casa(String direccion) {
		super();
		this.direccion = direccion;
	}



	//Paso8:  Declararemos los metodos de acceso que sean necesarios para los atributos
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


	public Float getM2() {
		return m2;
	}


	public void setM2(Float m2) {
		this.m2 = m2;
	}
	
	
	//Paso9:  Declaramos un metodo init sin parametros que invoque al constructor privado
	// y retorne una instancia de objeto
	public Casa init() {
		return new Casa();
	}

	
	//Paso10:  Declaramos un metodo modificar que modifique todos los atributos del objeto
	public void modificar(int numHabitaciones, int planta, String direccion, Float m2) {
		this.setM2(m2);
		this.setNumHabitaciones(numHabitaciones);
		this.setPlanta(planta);
		this.direccion = direccion;
	}
	
	
	//Paso11:  Declaramos un metodo modificar que modifique todos los atributos del objeto
	// pasandole como parametro  unicamente otro objeto Casa
	public void modificar(Casa casa) {
		this.setM2(casa.getM2());
		this.setNumHabitaciones(casa.getNumHabitaciones());
		this.setPlanta(casa.getPlanta());
		this.direccion = casa.direccion;
	}
	
	
	//Paso12:  Sobreescribir el metodo toString para que se muestren los atributos de esta clase
	@Override
	public String toString() {
		return "ATRIBUTOS DE LA CASA:"
				+ "\n  - Nùmero de habitaciones: " + this.getNumHabitaciones()
				+ "\n  - Planta: " + this.getPlanta()
				+ "\n  - Direccion: " + this.direccion
				+ "\n  - Metros Cuadrados: " + this.getM2() + "\n";
	}
	
}
