import com.javabasico.base.practicas.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {

		//NO SE SUELE HACER UNA SOBRECARGA DE METODOS ENTRE ESTATICOS Y NO EST�TICOS
		
		//Inicializamos dos variables de tipo entero:numero1 y numero2

        int numero1 = 5;
        int numero2 = 2;
		
		Integer numero3 = 1222;
		Integer numero4 = 2;
		
		//Invocamos a los m�todos est�ticos de la calculadora

        Calculadora calculadora = new Calculadora();
        calculadora.suma(numero1,numero2);
        calculadora.resta(numero1,numero2);
        calculadora.multiplicacion(numero1,numero2);
        calculadora.division(numero1,numero2);
		
		//Invocar al m�todo no est�tico para que realice la suma de lo  n�meros
		//Nota:El m�s ajustado a los datos int es el m�todo est�tico
		//Nota:El m�s ajustado a los datos Integer es el m�todo NO est�tico		
		
		
		//Nota:UNBOXING convierte  los Integer a int y asi puede utilizar el m�todo
		
		
				
		/* Nota:
		 *  La siguiente invocacion da error de compilaci�n,
		 *  porque no sabe cual de los dos m�todos coger.
		 *  numero1 es de tipo int
		 *  numero4 es de tipo Integer
		 */
		//calculadora.suma(numero1,numero4);
	}

}
