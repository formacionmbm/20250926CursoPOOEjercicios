package com.proyecto.common.util;

import java.util.Arrays;

import com.proyecto.common.Constantes;
import com.proyecto.common.NotAllowedWord;
import com.proyecto.common.exception.CodeErrors;
import com.proyecto.common.exception.NotAllowedWordsException;
import com.proyecto.common.exception.StringNotValidException;
import com.proyecto.common.exception.StringTooLongException;

public class ValidationString {

	// Paso 1. Implementar un m�todo est�tico "validLenght"que valide
	// si una cadena tiene mas tama�ano de 25 posiciones y menos de 1 posici�n
	// El m�todo tiene que devolver void, utilizar excepciones, declarar las
	// necesarias
	public static void validLenght(String str) throws StringNotValidException {
		
	}
	
		// Paso 1.1. Validar si la cadena no es nula y no esta vac�a
	if (str == null || str.isEmpty()) {
		throw new StringNotValidException(CodeErrors.NO_STRING, "ER_STR001");
	}
	
		// Paso 1.2 Validar si es mayor que el tama�o maximo (Constantes)
	if (str.lenght > Constantes.TAMANIO_MAX) {
		throw new StringNotValidException(CodeErrors.STRING_TOO_LONG, "ER_STR002");
	}
	
		// Paso 1.3 Validar si es menor que el tama�o minimo (Constantes)
	if (str.lenght < Constantes.TAMANIO_MIN) {
		throw new StringNotValidException(CodeErrors.STRING_TOO_SHORT, "ER_STR003");
	}
		
		// Paso 1.4 Validar si no contiene palabras no permitidas;
	if (str.contains(NotAllowedWord)) {
		throw new StringNotValidException(CodeErrors.WORD_NOT_ALLOWED_FOUND, "ER_STR004");
	}
	

	// Paso 2: Sobrecargar el m�todo anterior para que realize las
	// validaciones con dos valores m�ximo y m�nimo pasados por par�metros
	
		// Paso 1.1. Validar si la cadena no es nula y no esta vac�a
		// Paso 1.2 Validar si es mayor que el tama�o maximo (Constantes)
		// Paso 1.3 Validar si es menor que el tama�o minimo (Constantes)
		// Paso 1.4 Validar si no contiene palabras no permitidas;		
		
	

	// Paso 3. Si alguna funcionalidad se repitiese extraerla en un m�todo privado
	

}
