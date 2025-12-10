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
		
		
		System.out.println(" --- INICIO DEL PROGRAMA ---\n");
		
		try (Scanner sc = new Scanner(System.in)){
			
			// Paso 1. Realizar un bucle infinito, que �nicamente se pare
			// cuando el c�digo lance una excepcion de cadena nula o vac�a o 
			// de palabra no permitida introducida
			while (true) {
				
				// Paso 2. Pedir una cadena por consola al usuario
				palabra = "";
				System.out.println("Ingrese una palabra: ");
				palabra = sc.nextLine();
				
				// Paso 3. Validar si la cadena es correcta con los valores por defecto
				// Si no es correcta mostrar al usuario el mensaje adecuado por cada caso
				// Implementar otro bloque try/catch anidado que solo capture las excepciones
		        // de tama�o.
				
				try {
					ValidationString.validLenght(palabra);
					
					// Paso 3.1. Se muestra un mensaje de cadena v�lida
					System.out.println("Cadena valida: " + palabra + "\n");
					
				} catch (StringTooLongException stle) {
					System.out.println("Error de validacion de tamaño de la cadena: " + stle.getMessage() + ". Caracteres ingresados: " + stle.getTamanyo());
				} catch (StringTooShortException stse) {
					System.out.println("Error de validacion de tamaño de la cadena: " + stse.getMessage() + ". Caracteres ingresados: " + stse.getTamanyo());
				} 
				
				
			}
		
			
		//Paso 4. Cuando se recojan todas las excepciones (de ambos bloques try/cach)
		//mostrar un mensaje adecuado a la  excepci�n recogida	
		} catch (NotAllowedWordsException nawe) {
			
			System.out.println("Error de validacion de cadena: " + nawe.getMessage() + ". Palabra invalida ingresada: " + nawe.getWord().name());
			
		} catch (StringNotValidException snve) {
			
			System.out.println("Error de validacion de cadena: " + snve.getMessage());
			
		} catch (Exception e) {
			
			System.out.println("Error general: " + e.getMessage());
			
		}
					
		System.out.println(" --- FIN DEL PROGRAMA --- ");
		
	}			
	

}
