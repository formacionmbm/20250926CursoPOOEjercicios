package com.base.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio05 {
/**
 * 
 * Vaciar una lista
 * Comprobar si una lista esta vacia
 * 
 * Mostrarlos con un syso la lista final
 */
	public static void main(String[] args) {
		List<Integer> lista=generarLista();
		
		

	}
	
	public static List<Integer> generarLista(){
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		return numeros;
	}
}
