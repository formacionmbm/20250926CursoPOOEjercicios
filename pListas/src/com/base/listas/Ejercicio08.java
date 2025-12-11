package com.base.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio08 {
/**
 * 
 * Eliminar sin duplicados
 * Mostras ambas.
 * 
 */
	public static void main(String[] args) {
		List<Integer> lista=generarLista();
		
		Set<Integer> set = new HashSet<>(lista); // Set (HasSet) es una Lista pero que no hazmite duplicados
		
		lista = new ArrayList<>(set);
		
		System.out.println(lista);

	}
	
	public static List<Integer> generarLista(){
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(26);
		numeros.add(23);
		numeros.add(35);
		numeros.add(23);
		numeros.add(26);
		return numeros;
	}
}
