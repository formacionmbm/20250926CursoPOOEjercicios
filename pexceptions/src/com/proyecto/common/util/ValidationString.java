package com.proyecto.common.util;

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
		validate(cadena, Constantes.TAMANIO_MAX, Constantes.TAMANIO_MIN);
	
	} //declaración método
	

	// Paso 2: Sobrecargar el m�todo anterior para que realize las
	// validaciones con dos valores m�ximo y m�nimo pasados por par�metros
	public static void validLenght(String cadena, int tamanio_max, int tamanio_min) throws StringNotValidException{
		validate(cadena, tamanio_max, tamanio_min);
	}

	// Paso 3. Si alguna funcionalidad se repitiese extraerla en un m�todo privado

	private static void validate(String cadena, int tamanio_max, int tamanio_min)
			throws StringNotValidException {
		// Paso 1.1. Validar si la cadena no es nula y no esta vac�a
		if(cadena == null || cadena.trim().isEmpty()) throw new StringNotValidException(CodeErrors.NO_STRING,"La cadena es nula o vacía");
		
		// Paso 1.2 Validar si es mayor que el tama�o maximo (Constantes)
		if(cadena.length() > tamanio_max)
			throw new StringTooLongException(cadena.length(),CodeErrors.STRING_TOO_LONG, "La cadena es demasiado larga");
		// Paso 1.3 Validar si es menor que el tama�o minimo (Constantes)
		if(cadena.length() < tamanio_min)
			throw new StringTooShortException(cadena.length(),CodeErrors.STRING_TOO_SHORT, "La cadena es demasiado corta");
		
		// Paso 1.4 Validar si no contiene palabras no permitidas;		
		NotAllowedWord[] words=NotAllowedWord.values();
		for(NotAllowedWord word:words) {
			if(cadena.toUpperCase().contains(word.toString()))
				throw new NotAllowedWordsException(word,CodeErrors.WORD_NOT_ALLOWED_FOUND, "La cadena contiene palabra no permitida: "+ word.toString());
		}
	}

	
	
	
}
