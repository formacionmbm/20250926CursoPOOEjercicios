package com.javabasico.base.practicas;

import static com.javabasico.base.practicas.Constantes.SUMA;
/**
 * Calculadora, se realizan las operaciones  b�sicas mediante metodos est�ticos
 * @author MARIA
 */
public class Calculadora {
	
	//A�adir las constantes para que no existan cadenas en los sysos
	//Se declaran como public static final String
	public class Mensajes {
    public static final String INGRESAR_NUM1 = "Ingrese el primer número:";
    public static final String INGRESAR_NUM2 = "Ingrese el segundo número:";
    public static final String INGRESAR_OPERADOR = "Ingrese el operador (+, -, *, /):";
    
    /*también se pueden utilizar constantes de operadores
    public static final String SUMA = "+";
    public static final String RESTA = "-";
    public static final String MULTIPLICACION = "*";
    public static final String DIVISION = "/"; */
    
    public static final String ERROR_DIVISION = "Error: división por cero";
    public static final String ERROR_OPERADOR = "Operador no válido";
    public static final String RESULTADO = "Resultado: ";
}
	
	 /*Suma
	 @param operando1
	 @param operando2 */
	 
	public static void suma(int operando1,int operando2) {
		int suma = operando1+operando2;
		//Aqui ni siquiera indicamos la clase porque tenemos importada la constante
		System.out.println(SUMA+suma);
	}
	
	/* Resta
	 * @param operando1
	 * @param operando2 */
	 
	public static void resta(int operando1,int operando2) {
		int resta = operando1-operando2;
		System.out.println("RESTA:"+resta);
	}
	
	
	 /* Multiplicacion
	  @param operando1
	  @param operando2 */
	 
	public static void multiplicacion(int operando1,int operando2) {
		long multiplicacion = operando1*operando2;
		System.out.println("MULTIPLICACION"+multiplicacion);
	}

	 /*Division
	  @param operando1
	  @param operando2 */
	
	public static void division(int operando1,int operando2) {
		double division = operando1/operando2;
		System.out.println("DIVISION"+division);
		
	}
	
	//A�adir un m�todo no est�tico que realice la suma.
	
	//Quitamos el método estático, cambiamos el tipo de int a long (de uno o de todos)
	public void suma(long operando1, long operando2) {
		long suma = operando1+operando2;
		System.out.println(SUMA+suma);
	}
	
	//NO SE SUELE HACER UNA SOBRECARGA DE METODOS ENTRE ESTATICOS Y NO EST�TICOS
	
	
	

}
