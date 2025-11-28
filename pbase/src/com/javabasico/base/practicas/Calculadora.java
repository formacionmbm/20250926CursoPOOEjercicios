package com.javabasico.base.practicas;

import static com.javabasico.base.practicas.Constantes.SUMA;
/**
 * Calculadora, se realizan las operaciones básicas mediante metodos estáticos
 * @author MARIA
 *
 */
public class Calculadora {
	//Añadir las constantes para que no existan cadenas en los sysos
	/**
	 * Suma
	 * @param operando1
	 * @param operando2
	 */
	public static void suma(int operando1,int operando2) {
		int suma = operando1+operando2;
		//Aqui ni siquiera indicamos la clase porque tenemos importada la constante
		System.out.println(SUMA+suma);
	}

	/**
	 * Resta
	 * @param operando1
	 * @param operando2
	 */
	public static void resta(int operando1,int operando2) {
		int resta = operando1-operando2;
		System.out.println("RESTA:"+resta);
	}

	/**
	 * Multiplicacion
	 * @param operando1
	 * @param operando2
	 */
	public static void multiplicacion(int operando1,int operando2) {
		long multiplicacion = operando1*operando2;
		System.out.println("MULTIPLICACION"+multiplicacion);
	}

	/**
	 * Division
	 * @param operando1
	 * @param operando2
	 */
	public static void division(int operando1,int operando2) {
		double division = operando1/operando2;
		System.out.println("DIVISION"+division);
	}
	//Añadir un método no estático que realize la suma
	//NO SE SUELE HACER UNA SOBRECARGA DE METODOS ENTRE ESTATICOS Y NO ESTÁTICOS
	
	
	

}
