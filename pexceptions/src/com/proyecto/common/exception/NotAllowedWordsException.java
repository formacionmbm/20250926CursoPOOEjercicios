package com.proyecto.common.exception;

import com.proyecto.common.NotAllowedWord;

//Paso 1. Identificar esta clase commo hija de StringNotValidException
public class NotAllowedWordsException extends StringNotValidException {

	// Paso 2. Indicar un atributo tipo NotAllowedWord llamado "word"
	
	private NotAllowedWord word;
	
	
		
	//Paso 3. Implementar un constructor que tenga los parametros  necesarios
	
	public NotAllowedWordsException(NotAllowedWord word) {
	    super("notallowed word" + word);
	    
	

	
	// para invocar al constructor padre y asignar/establecer el valor de word.
	
	this.word = word;
	}

	//Paso 4. Implementar el m�todo get para devolver el valor de word
	
	 public NotAllowedWord getWord() {
	        return word;
	 }
	
	
}
