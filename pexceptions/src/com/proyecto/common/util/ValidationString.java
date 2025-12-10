package com.proyecto.common.util;

import java.util.Arrays;

import com.proyecto.common.Constantes;
import com.proyecto.common.NotAllowedWord;
import com.proyecto.common.exception.CodeErrors;
import com.proyecto.common.exception.NotAllowedWordsException;
import com.proyecto.common.exception.StringNotValidException;
import com.proyecto.common.exception.StringTooLongException;
import com.proyecto.common.exception.StringTooShortException;

public class ValidationString {

	// Paso 1. Implementar un m�todo est�tico "validLenght"que valide
	// si una cadena tiene mas tama�ano de 25 posiciones y menos de 1 posici�n
	// El m�todo tiene que devolver void, utilizar excepciones, declarar las
	// necesarias
		
		public static void validLenght(String cadena) throws StringNotValidException{
			
			// Paso 1.1. Validar si la cadena no es nula y no esta vac�a
			validNotNullVoid(cadena);
			
			// Paso 1.2 Validar si es mayor que el tama�o maximo (Constantes)
			validLengthMax(cadena, Constantes.TAMANIO_MAX);
			
			// Paso 1.3 Validar si es menor que el tama�o minimo (Constantes)
			validLengthMin(cadena, Constantes.TAMANIO_MIN);
			
			// Paso 1.4 Validar si no contiene palabras no permitidas;
			validNotAllowedWord(cadena);
			
		}
	

	// Paso 2: Sobrecargar el m�todo anterior para que realize las
	// validaciones con dos valores m�ximo y m�nimo pasados por par�metros
	
		public static void validLenght(String cadena, int max, int min) throws StringNotValidException{
			
			// Paso 1.1. Validar si la cadena no es nula y no esta vac�a
			validNotNullVoid(cadena);
			
			// Paso 1.2 Validar si es mayor que el tama�o maximo (Constantes)
			validLengthMax(cadena, max);
			
			// Paso 1.3 Validar si es menor que el tama�o minimo (Constantes)
			validLengthMin(cadena, min);
			
			// Paso 1.4 Validar si no contiene palabras no permitidas;
			validNotAllowedWord(cadena);
			
		}

		
		// Paso 3. Si alguna funcionalidad se repitiese extraerla en un m�todo privado

		private static void validNotNullVoid(String cadena) throws StringNotValidException {
			if (cadena == null || cadena.trim().isEmpty()) {
			    throw new StringNotValidException(CodeErrors.NO_STRING, "Cadena nula o vacia.");
			}
		}
		
		private static void validLengthMax(String cadena, int max) throws StringTooLongException {
			if (cadena.length() > max) {
				throw new StringTooLongException(CodeErrors.STRING_TOO_LONG, "Cadena muy grande", cadena.length()); //no se si es el tamaño de la cadena o el max
			}
		}
		
		private static void validLengthMin(String cadena, int min) throws StringTooShortException {
			if (cadena.length() < min) {
				throw new StringTooShortException(CodeErrors.STRING_TOO_SHORT, "Cadena muy pequeña", cadena.length()); //no se si es el tamaño de la cadena o el min
			}
		}
		
		private static void validNotAllowedWord(String cadena) throws NotAllowedWordsException {
			
			String textoMinuscula = cadena.toLowerCase();
		    
		    for (NotAllowedWord naw : NotAllowedWord.values()) {
		        
		        if (textoMinuscula.contains(naw.name().toLowerCase())) {
		            
		        	throw new NotAllowedWordsException(CodeErrors.WORD_NOT_ALLOWED_FOUND, "Cadena no permitida", naw);
		        	
		        }
		    }
			
		}

		
}
