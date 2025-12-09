import com.javabasico.base.practicas.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {

		//NO SE SUELE HACER UNA SOBRECARGA DE METODOS ENTRE ESTATICOS Y NO ESTATICOS
		
		//Inicializamos dos variables de tipo entero:numero1 y numero2
		
		
		int numero1 =  25;
		int numero2 = 5;
		Integer numero3 =  1222;
		Integer numero4 = 2;
		
		//Invocamos a los metodos estaticos de la calculadora
		Calculadora.suma(numero1, numero2);
		Calculadora.resta(numero1, numero2);
		Calculadora.multiplicacion(numero1, numero2);
		Calculadora.division(numero1, numero2);
		
		//Invocar al  metodo no estatico para que realice la suma de lo  numeros
		//Nota:El mas ajustado a los datos int es el metodo estatico
		//Nota:El mas ajustado a los datos Integer es el metodo NO estatico		
		Calculadora calculadora = new Calculadora();
		calculadora.suma2(numero3, numero4);
		
		//Nota:UNBOXING convierte  los Integer a int y asi puede utilizar el metodo
		
		
				
		/* Nota:
		 *  La siguiente invocacion da error de compilaci�n,
		 *  porque no sabe cual de los dos m�todos coger.
		 *  numero1 es de tipo int
		 *  numero4 es de tipo Integer
		 */
		calculadora.suma2(numero1,numero4);
	}

}
