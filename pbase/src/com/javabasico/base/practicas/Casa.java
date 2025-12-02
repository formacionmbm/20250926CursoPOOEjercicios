package com.javabasico.base.practicas;


public class Casa {
	//Paso1: Inicializamos las variables de entero: numHabitaciones y planta por defecto a 0
	private int numHabitaciones=0;
    private int planta=0;

    //Paso2:  Declaramos una cadena de acceso publica llamada direcci�n
	public String direccion;
	//Paso3:  Declaramos y asignamos un objeto privado float para los m2, le damos un valor
	// por defecto
    private Integer m2=0;
	
	//Paso4:  Declaramos un constructor privado por defecto
    private Casa(){
    }

	//Paso5:  Declaramos un constructor publico con los atributos de tipo primitivo
    public Casa(int numHabitaciones, int planta){
        this.numHabitaciones = numHabitaciones;
        this.planta = planta;
    }
	//Paso6:  Declarmos un constructor con todos los tipos numericos
    public Casa(int numHabitaciones, int planta, Integer m2){
        this.numHabitaciones = numHabitaciones;
        this.planta = planta;
        this.m2 = m2;
    }
	
	//Paso7:  Declaramos un constructor protegido con los datos de cadena
    protected Casa(String direccion){
        this.direccion = direccion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getM2() {
        return m2;
    }

    public void setM2(Integer m2) {
        this.m2 = m2;
    }


    //Paso9:  Declaramos un metodo init sin parametros que invoque al constructor privado
	// y retorne una instancia de objeto
    public static Casa init() {
        Casa casa1 = new Casa();
        return casa1;
    }
	
	//Paso10:  Declaramos un metodo modificar que modifique todos los atributos del objeto
    public static void modificar (int numHabitaciones, int planta, String direccion, Integer m2){
        this.numHabitaciones = numHabitaciones;
        this.planta = planta;
        this.direccion = direccion;
        this.m2=m2;
    }
	
	//Paso11:  Declaramos un metodo modificar que modifique todos los atributos del objeto
	// pas�ndole como par�metro �nicamente otro objeto Casa
	
	
	
	
	//Paso12:  Sobreescribir el m�todo toString para que se muestren los atributos de esta clase
	
}
