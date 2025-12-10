package com.base.listas;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio02 {
/**
 * 
 * Con la lista dada, obtener el tama�o de una lista y al primer y �ltimo elemento
 * Mostrarlos con un syso
 */
	public static void main(String[] args) {
		List<Integer> lista=generarLista();
		int tamanio = lista.size();
		int primero = lista.getFirst();
		int ultimo = lista.getLast();
		
		System.out.println("Tamaño lista: " + tamanio + "\n" +
							"Primer elemento: " + primero + "\n" +
							"Ultimo elemento: " + ultimo);

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
