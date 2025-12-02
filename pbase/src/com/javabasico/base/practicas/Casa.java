package com.javabasico.base.practicas;


public class Casa {
	//Paso1: Inicializamos las variables de entero: numHabitaciones y planta por defecto a 0

    int numHabitaciones = 0;
    int planta = 0;

	//Paso2:  Declaramos una cadena de acceso publica llamada direcci�n

    public String direccion;
	
	//Paso3:  Declaramos y asignamos un objeto privado float para los m2, le damos un valor
	// por defecto

    private float m2 = 0.0F;
	
	//Paso4:  Declaramos un constructor privado por defecto

    private Casa() {
    }

    //Paso5:  Declaramos un constructor publico con los atributos de tipo primitivo

    public Casa(int planta, int numHabitaciones, float m2) {
        this.planta = planta;
        this.numHabitaciones = numHabitaciones;
        this.m2 = m2;
    }


    //Paso6:  Declarmos un constructor con todos los tipos numericos

    public Casa(int planta, int numHabitaciones) {
        this.planta = planta;
        this.numHabitaciones = numHabitaciones;

    }
	
	//Paso7:  Declaramos un constructor protegido con los datos de cadena

    protected Casa(String direccion) {
        this.direccion = direccion;
    }


    //Paso8:  Declararemos los m�todos de acceso que sean necesarios para los atributos

    public float getM2() {
        return m2;
    }

    public void setM2(float m2) {
        this.m2 = m2;
    }


    //Paso9:  Declaramos un metodo init sin parametros que invoque al constructor privado
	// y retorne una instancia de objeto

    public static Casa init(){
        return new Casa();
    }
	
	//Paso10:  Declaramos un metodo modificar que modifique todos los atributos del objeto
	
	public void modificar(int planta, int numHabitaciones, float m2, String direccion){
        this.planta = planta;
        this.numHabitaciones = numHabitaciones;
        this.m2 = m2;
        this.direccion = direccion;
    }
	
	//Paso11:  Declaramos un metodo modificar que modifique todos los atributos del objeto
	// pas�ndole como par�metro �nicamente otro objeto Casa

    public void modificar(Casa otraCasa) {
        this.planta = otraCasa.planta;
        this.numHabitaciones = otraCasa.numHabitaciones;
        this.m2 = otraCasa.m2;
        this.direccion = otraCasa.direccion;
    }
	
	
	//Paso12:  Sobreescribir el m�todo toString para que se muestren los atributos de esta clase

    public String toString() { // esto lo tengo que entender
        return "Casa{" +
                "planta=" + planta +
                ", numHabitaciones=" + numHabitaciones +
                ", m2=" + m2 +
                ", direccion='" + direccion + '\'' +
                '}';
    }

}
