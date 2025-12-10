package com.proyecto.common.exception;

//Paso 1. Identificar esta clase commo hija de StringNotValidException
//
public class StringTooLongException extends StringNotValidException  {
	
	//Paso 2. Indicar un atributo inmutable tipo int llamado "tamanyo"
	//
	private final int tamanio; 
	
	//Paso 3. Implementar el constructor adecuado para asignar valor a todos
	// los atributos de esta clase incluidos los heredados
	//
	public StringTooLongException(String code, String msg, int tamanio) {

		
		// MCG: Inicializo los atributos heredados (code y msg) llamando al constructor del padre.
		super(code, msg);
	
		//MCG: Inicializo el tamanio
		this.tamanio = tamanio;
		
	}
	
	//Paso 4. Implementar un metodo para conseguir el valor del atributo "tamanio"
	//
	public int getTamanio() {
		return tamanio;
	}	
}
