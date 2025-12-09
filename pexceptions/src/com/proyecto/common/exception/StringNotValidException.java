package com.proyecto.common.exception;

public class StringNotValidException extends Exception  {  //hereda de Exception
	
	//Paso 1.Indicar atributo protegido de tipo String llamado "code"
	protected String code;
			
	//Paso 2. Implementar un constructor, que tenga por parámetro un valor para code y un mensaje para el constructor del padre
	public StringNotValidException (String code, String mensaje) {
		super (mensaje);          //super para llamar al padre
		this.code = code; //this:referencia del objeto
	}

}
