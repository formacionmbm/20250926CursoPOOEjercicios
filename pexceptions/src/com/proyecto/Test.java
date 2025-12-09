package com.proyecto;

import java.util.Scanner;

import com.proyecto.common.exception.NotAllowedWordsException;
import com.proyecto.common.exception.StringNotValidException;
import com.proyecto.common.exception.StringTooLongException;
import com.proyecto.common.exception.StringTooShortException;
import com.proyecto.common.util.ValidationString;

public class Test {

	// Todo el c�digo excepto las declaraciones debe estar en un bloque try-catch
	public static void main(String[] args)  {
		// Declarar las variables necesarias		
		String palabra = "";
		Scanner sc = new Scanner(System.in);
			
		try {
			
			// Paso 1. Realizar un bucle infinito, que �nicamente se pare
			// cuando el c�digo lance una excepcion de cadena nula o vac�a o 
			// de palabra no permitida introducida
			while (true) {
				
				// Paso 2. Pedir una cadena por consola al usuario
				palabra = "";
				System.out.println("Ingrese una palabra: ");
				palabra = sc.next();
				
				// Paso 3. Validar si la cadena es correcta con los valores por defecto
				// Si no es correcta mostrar al usuario el mensaje adecuado por cada caso
				// Implementar otro bloque try/catch anidado que solo capture las excepciones
		        // de tama�o.
				
				try {
					ValidationString.validLenght(palabra);
					
					// Paso 3.1. Se muestra un mensaje de cadena v�lida
					System.out.println("Cadena valida: " + palabra);
					
				} catch (StringTooLongException stle) {
					System.out.println("Error de validacion de tamaño de la cadena: " + stle.getMessage());
				} catch (StringTooShortException stse) {
					System.out.println("Error de validacion de tamaño de la cadena: " + stse.getMessage());
				} catch (StringNotValidException e) {
					throw e;
				}
				
				
			}
		
			
		//Paso 4. Cuando se recojan todas las excepciones (de ambos bloques try/cach)
		//mostrar un mensaje adecuado a la  excepci�n recogida	
		} catch (StringNotValidException snve) {
			
			System.out.println("Error de validacion de cadena: " + snve.getMessage());
			
		} catch (Exception e) {
			
			System.out.println("Error general: " + e.getMessage());
			
		}
		
		
			// Paso 1. Realizar un bucle infinito, que �nicamente se pare
			// cuando el c�digo lance una excepcion de cadena nula o vac�a o 
			// de palabra no permitida introducida
				// Paso 2. Pedir una cadena por consola al usuario
				
				// Paso 3. Validar si la cadena es correcta con los valores por defecto
				// Si no es correcta mostrar al usuario el mensaje adecuado por cada caso
				// Implementar otro bloque try/catch anidado que solo capture las excepciones
		        // de tama�o.
						
						// Paso 3.1. Se muestra un mensaje de cadena v�lida
		//Paso 4. Cuando se recojan todas las excepciones (de ambos bloques try/cach)
		//mostrar un mensaje adecuado a la  excepci�n recogida				
			
											
	}			
	

}
