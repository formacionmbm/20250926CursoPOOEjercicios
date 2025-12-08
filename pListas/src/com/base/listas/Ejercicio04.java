package com.base.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio04 {
/**
 * 
 * Eliminar un elemento por valor
 * Eliminar un elemento por indice
 * 
 * Mostrarlos con un syso la lista final
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> lista=generarLista();
		System.out.println("Introducir un entero:");
		int indice;//recoger un entero;
		//Eliminaci�n por indice. El tipo es int
		
		Integer numero; //cambiarlo a integer;
		//Eliminaci�n por numero. El tipo es Integer
		
		
		
		sc.close();

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
