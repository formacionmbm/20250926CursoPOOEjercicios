package com.javabasico.base.practicas;

public class Casa {

	// Paso1: Inicializamos las variables de entero: numHabitaciones y planta por
	// defecto a 0
	private int numHabitaciones;
	private int planta;

	// Paso2: Declaramos una cadena de acceso publica llamada direcci�n
	public String direccion;

	// Paso3: Declaramos y asignamos un objeto privado float para los m2, le damos
	// un valor

	private Float m2 = 80.50f;

	// Paso4: Declaramos un constructor privado por defecto
	private Casa() {

	}

	// Paso5: Declaramos un constructor publico con los atributos de tipo primitivo
	public Casa(int numHabitaciones, int planta) {
		this.numHabitaciones = numHabitaciones;
		this.planta = planta;
	}

	// Paso6: Declarmos un constructor con todos los tipos numericos
	public Casa(int numHabitaciones, int planta, Float m2) {
		this.numHabitaciones = numHabitaciones;
		this.planta = planta;
		this.m2 = m2;
	}

	// Paso7: Declaramos un constructor protegido con los datos de cadena
	protected Casa(String direccion) {
		this.direccion = direccion;
	}

	// Paso8: Declararemos los m�todos de acceso que sean necesarios para los
	// atributos
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

	// Paso9: Declaramos un metodo init sin parametros que invoque al constructor
	// privado

	
	//Paso4:  Declaramos un constructor privado por defecto
	private Casa() {}
	
	//Paso5:  Declaramos un constructor publico con los atributos de tipo primitivo
	public Casa(int numHabitaciones,int planta) {
		this.numHabitaciones=numHabitaciones;
		this.planta=planta;
	}
	//Paso6:  Declarmos un constructor con todos los tipos numericos
	public Casa(int numHabitaciones,int planta,Float m2) {
		this.numHabitaciones=numHabitaciones;
		this.planta=planta;
		this.m2=m2;
	}
	
	//Paso7:  Declaramos un constructor protegido con los datos de cadena
	protected Casa(String direccion) {
		this.direccion=direccion;
	}

	
	
	//Paso8:  Declararemos los m�todos de acceso que sean necesarios para los atributos
	
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
>>>>>>> refs/heads/solucion
	// y retorne una instancia de objeto
	public Casa init() {
<<<<<<< HEAD
		Casa casa = new Casa();
		return casa;
	}

	// Paso10: Declaramos un metodo modificar que modifique todos los atributos del
	// objeto
	public void modificar(int numHabitaciones, int planta, Float m2, String direccion) {
		this.numHabitaciones = numHabitaciones;
		this.planta = planta;
		this.m2 = m2;
		this.direccion = direccion;
	}

	// Paso11: Declaramos un metodo modificar que modifique todos los atributos del
	// objeto
	// pas�ndole como par�metro �nicamente otro objeto Casa
	public void modificar(Casa casa) {
		this.numHabitaciones = casa.numHabitaciones;
		this.planta = casa.planta;
		this.m2 = casa.m2;
		this.direccion = casa.direccion;
	}

	// Paso12: Sobreescribir el m�todo toString para que se muestren los atributos
	// de esta clase
	@Override
	public String toString() {
		return "numHabitaciones = " + numHabitaciones + ", planta = " + planta + ", direccion = "
				+ String.valueOf(direccion) + ", m2 = " + String.valueOf(m2);
	}

=======
		return new Casa();
	}
	
	//Paso10:  Declaramos un metodo modificar que modifique todos los atributos del objeto
	public void modificar(int numHabitaciones,int planta,String direccion,Float m2) {
		this.numHabitaciones=numHabitaciones;
		this.planta=planta;
		this.direccion=direccion;
		this.m2=m2;
	}
	
	
	//Paso11:  Declaramos un metodo modificar que modifique todos los atributos del objeto
	// pas�ndole como par�metro �nicamente otro objeto Casa
	public void modificar(Casa casa) {
		this.numHabitaciones=casa.numHabitaciones;
		this.planta=casa.planta;
		this.direccion=casa.direccion;
		this.m2=casa.m2;
	}

	
		
	
	//Paso12:  Sobreescribir el m�todo toString para que se muestren los atributos de esta clase
	@Override
	public String toString() {
		return "Casa [numHabitaciones=" + numHabitaciones + ", planta=" + planta + ", direccion=" + direccion + ", m2="
				+ m2 + "]";
	}
>>>>>>> refs/heads/solucion
}
