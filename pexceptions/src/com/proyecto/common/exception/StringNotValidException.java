package com.proyecto.common.exception;

public class StringNotValidException extends Exception{
	
	//Paso 1.Indicar atributo protegido de tipo String llamado "code"
	protected String code;
	protected String mensaje;		
	
	//Paso 2. Implementar un contructor, que tenga por parametro un valor para code
	// y un mensaje para el constructor del padre
	public StringNotValidException(String code, String mensaje) {
		
		// Llamamos al constructor de la clase padre (RuntimeException) con el mensaje
			super(mensaje);
		this.code = code;
	}
	
	

}








