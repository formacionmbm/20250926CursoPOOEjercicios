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
		String cadena;
		
			try(Scanner sc = new Scanner(System.in)) {
			// Paso 1. Realizar un bucle infinito, que �nicamente se pare
		    // cuando el c�digo lance una excepcion de cadena nula o vac�a o 
			// de palabra  introducida no permitida
		    while(true) {
				// Paso 2. Pedir una cadena por consola al usuario
				System.out.println("Dame cadena:");
				cadena = sc.nextLine();
				
				// Paso 3. Validar si la cadena es correcta con los valores por defecto
				// Si no es correcta mostrar al usuario el mensaje adecuado por cada caso
				// Implementar otro bloque try/catch anidado que solo capture las excepciones
		        // de tama�o.
				try {
					
					ValidationString.validLenght(cadena);
					// Paso 3.1. Se muestra un mensaje de cadena v�lida
					System.out.println("La cadena es válida");
					
				}catch(StringTooLongException stle) {
					System.out.println(stle.getMessage());
				}catch(StringTooShortException stse) {
					System.out.println(stse.getMessage());
				}
						
				
		    }
		//Paso 4. Cuando se recojan todas las excepciones (de ambos bloques try/cach)
		//mostrar un mensaje adecuado a la  excepci�n recogida				
			}catch(NotAllowedWordsException nawe) {
				System.out.println(nawe.getMessage());
			}catch(StringNotValidException snve) {
				System.out.println(snve.getMessage());
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
											
	}			
	

}
