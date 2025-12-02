
import com.javabasico.base.practicas.Calculadora;


public class TestCalculadora {

	public static void main(String[] args) {

		//NO SE SUELE HACER UNA SOBRECARGA DE METODOS ENTRE ESTATICOS Y NO EST�TICOS
		
		//Inicializamos dos variables de tipo entero:numero1 y numero2
		
		
		Integer numero3 =  1222;
		Integer numero4 = 2;
		
		//Invocamos a los m�todos est�ticos de la calculadora
		
		Calculadora.suma(numero3, numero4);
		Calculadora.resta(numero3, numero4);
		Calculadora.multiplicacion(numero3, numero4);
		Calculadora.division(numero3, numero4);
		
		
		//Invocar al m�todo no est�tico para que realice la suma de lo  n�meros
		
		Calculadora calc = new Calculadora(); 
		calc.suma1(numero3, numero4);
		
	
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
