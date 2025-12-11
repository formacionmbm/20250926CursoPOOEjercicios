package com.base.listas;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


public class Ejercicio07 {
/**
 * 
 * Ordenar listas de enteros al derecho y al reves
 * Mostras ambas.
 * 
 */
	public static void main(String[] args) {
		List<Integer> lista=generarLista();
		
		Collections.sort(lista);
		System.out.println("Lista ordenada: " + lista);
		
		Collections.sort(lista.reversed());
		System.out.println("Lista ordenada a la inversa: " + lista);

	}
	
	public static List<Integer> generarLista(){
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(26);
		numeros.add(23);
		numeros.add(35);
		numeros.add(4);
		numeros.add(54);
		return numeros;
	}
}
