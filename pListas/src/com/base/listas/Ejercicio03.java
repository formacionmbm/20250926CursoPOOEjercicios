package com.base.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio03 {
/**
 * 
 * Con la lista dada, verificar si un elemento existe
 * 
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> lista=generarLista();
		
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
