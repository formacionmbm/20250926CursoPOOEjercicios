package com.proyecto.common.util;

import java.util.Arrays;

import com.proyecto.common.Constantes;
import com.proyecto.common.NotAllowedWord;
import com.proyecto.common.exception.*;

public class ValidationString {

	// Paso 1. Implementar un m�todo est�tico "validLenght"que valide
	// si una cadena tiene mas tama�ano de 25 posiciones y menos de 1 posici�n
	// El m�todo tiene que devolver void, utilizar excepciones, declarar las
	// necesarias
    public static void validLenght(String str) throws StringNotValidException {
        // Paso 1.1. Validar si la cadena no es nula y no esta vac�a
        if (str == null || str.isEmpty()) {
            throw new StringNotValidException(CodeErrors.NO_STRING, "La cadena no puede ser nula o vacía.");
        }
        // Paso 1.2 Validar si es mayor que el tama�o maximo (Constantes)
        if (str.length() > Constantes.TAMANIO_MAX) {
            throw new StringTooLongException(CodeErrors.STRING_TOO_LONG, "La cadena excede el tamaño máximo permitido.");
        }
        // Paso 1.3 Validar si es menor que el tama�o minimo (Constantes)
        if( str.length() < Constantes.TAMANIO_MIN) {
            throw new StringTooShortException(CodeErrors.STRING_TOO_SHORT, "La cadena es menor que el tamaño mínimo permitido.");
        }
        // Paso 1.4 Validar si no contiene palabras no permitidas;
        for (NotAllowedWord word : NotAllowedWord.values()) {
            if (str.toLowerCase().contains(word.toString())) {
                throw new NotAllowedWordsException(CodeErrors.WORD_NOT_ALLOWED_FOUND,
                        "La cadena contiene una palabra no permitida: " + word.toString(), word);
            }
        }
    }

	// Paso 2: Sobrecargar el m�todo anterior para que realize las
	// validaciones con dos valores m�ximo y m�nimo pasados por par�metros
	public static void validLength(String str, int max, int min) throws StringNotValidException {
        // Paso 1.1. Validar si la cadena no es nula y no esta vac�a
        if (str == null || str.isEmpty()) {
            throw new StringNotValidException(CodeErrors.NO_STRING, "La cadena no puede ser nula o vacía.");
        }
        // Paso 1.2 Validar si es mayor que el tama�o maximo (parámetro)
        if (str.length() > max) {
            throw new StringTooLongException(CodeErrors.STRING_TOO_LONG, "La cadena excede el tamaño máximo permitido.");
        }
        // Paso 1.3 Validar si es menor que el tama�o minimo (parámetro)
        if( str.length() < min) {
            throw new StringTooShortException(CodeErrors.STRING_TOO_SHORT, "La cadena es menor que el tamaño mínimo permitido.");
        }
        // Paso 1.4 Validar si no contiene palabras no permitidas;
        for (NotAllowedWord word : NotAllowedWord.values()) {
            if (str.toLowerCase().contains(word.toString())) {
                throw new NotAllowedWordsException(CodeErrors.WORD_NOT_ALLOWED_FOUND,
                        "La cadena contiene una palabra no permitida: " + word.toString(), word);
            }
        }
    }
	// Paso 3. Si alguna funcionalidad se repitiese extraerla en un m�todo privado
}
