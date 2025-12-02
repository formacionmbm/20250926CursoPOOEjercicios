package com.javabasico.base.practicas;


public class Casa {
	//Paso1: Inicializamos las variables de entero: numHabitaciones y planta por defecto a 0
	public int numHabitaciones = 0;
	public int planta = 0;
	//Paso2:  Declaramos una cadena de acceso publica llamada direcci�n
	public String direccion;
	//Paso3:  Declaramos y asignamos un objeto privado float para los m2, le damos un valor
	// por defecto
	private float m2 = 100f;
	
	//Paso4:  Declaramos un constructor privado por defecto
	private Casa() {
		System.out.println("Casa creada const1");
	}
	//Paso5:  Declaramos un constructor publico con los atributos de tipo primitivo
	public Casa(int numHabitaciones, int planta, float m2) {
		this.numHabitaciones = numHabitaciones;
        this.planta = planta;
        this.m2 = m2;
        System.out.println("Casa creada const2");
	}
	//Paso6:  Declarmos un constructor con todos los tipos numericos
	//no hay mas 
	
	
	//Paso7:  Declaramos un constructor protegido con los datos de cadena
	protected Casa(int numHabitaciones, int planta, float m2, String direccion) {
		this.numHabitaciones = numHabitaciones;
        this.planta = planta;
        this.m2 = m2;
        this.direccion=direccion;
        System.out.println("Casa creada const3");
	}
	//Paso8:  Declararemos los m�todos de acceso que sean necesarios para los atributos
	public int getNumHabitaciones() {
		return numHabitaciones;
	}
	public int getPlanta() {
		return planta;
	}
	public float getM2() {
		return m2;
	}
	
	public void setM2(float m2) {
        this.m2 = m2;
    }
	
	public void setPlanta(int planta) {
        this.planta = planta;
    }
	
	public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
	
	//Paso9:  Declaramos un metodo init sin parametros que invoque al constructor privado
	// y retorne una instancia de objeto
	
	public static Casa init() {
		return new Casa();
	}
	//Paso10:  Declaramos un metodo modificar que modifique todos los atributos del objeto
	
	public void modificar(int numHabitaciones, int planta, float m2, String direccion) {
        this.numHabitaciones = numHabitaciones;
        this.planta = planta;
        this.m2 = m2;
        this.direccion = direccion;
        System.out.println("Todos los atributos modificados.");
    }
	//Paso11:  Declaramos un metodo modificar que modifique todos los atributos del objeto
	// pas�ndole como par�metro �nicamente otro objeto Casa
	
	public void modificar(Casa otraCasa) {
        this.numHabitaciones = otraCasa.numHabitaciones;
        this.planta = otraCasa.planta;
        this.m2 = otraCasa.m2;
        this.direccion = otraCasa.direccion;
        System.out.println("Atbutos copiados");
    }
	 
	
	//Paso12:  Sobreescribir el m�todo toString para que se muestren los atributos de esta clase
	public String toString() {
		return "Casa = {" + " numHabitaciones: " + numHabitaciones + " - m2: " + m2 + " - direccion : " + direccion + " - planta: " + planta + " }";
	}
}
