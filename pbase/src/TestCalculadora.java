import com.javabasico.base.practicas.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {

		//NO SE SUELE HACER UNA SOBRECARGA DE METODOS ENTRE ESTATICOS Y NO ESTÁTICOS
		
		//Inicializamos dos variables de tipo entero:numero1 y numero2
		
		
		Integer numero3 =  1222;
		Integer numero4 = 2;
		
		//Invocamos a los métodos estáticos de la calculadora
		
		
		//Invocar al método no estático para que realice la suma de lo  números
		//Nota:El más ajustado a los datos int es el método estático
		//Nota:El más ajustado a los datos Integer es el método NO estático		
		
		
		//Nota:UNBOXING convierte  los Integer a int y asi puede utilizar el método
		
		
				
		/* Nota:
		 *  La siguiente invocacion da error de compilación,
		 *  porque no sabe cual de los dos métodos coger.
		 *  numero1 es de tipo int
		 *  numero4 es de tipo Integer
		 */
		//calculadora.suma(numero1,numero4);
	}

}
