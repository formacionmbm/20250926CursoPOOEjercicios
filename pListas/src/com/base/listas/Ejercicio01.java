package com.base.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio01 {
/**
 * 
 * Crear una lista de enteros y agregar 5 elementos.
 * Mostrarlos con un syso
 */
	public static void main(String[] args) {
		
		List<Integer> enteros = new ArrayList<>(); 
		
		enteros.add(1);
		enteros.add(2);
		enteros.add(3);
		enteros.add(4);
		enteros.add(5);
		
		System.out.println(enteros);

	}

}
