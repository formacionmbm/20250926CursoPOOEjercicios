package com.base.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio09 {
/**
 * 
 * Comprobar que la lista contiene el objeto Casa,
 * modificar el objeto Casa para que funcione el metodo contains
 * 
 */
	public static void main(String[] args) {
		List<Casa> lista=generarLista();
		Casa casa =new Casa(110,"XXXXX");
		
		
		System.out.println("Contiene casa:"+lista.contains(casa));

	}
	
	public static List<Casa> generarLista(){
		List<Casa> casas = new ArrayList<Casa>();
		casas.add(new Casa(100,"XXXXXX"));
		casas.add(new Casa(110,"XXXXX"));;
		casas.add(new Casa(120,"XXXX"));
		casas.add(new Casa(130,"XXX"));
		casas.add(new Casa(140,"XX"));
		return casas;
	}
	static class Casa{
		
	   int tamanio;
	   String direccion;
	   
	   public Casa(int tamanio, String direccion) {
		   this.tamanio=tamanio;
		   this.direccion=direccion;
	   }

	   @Override
	   public String toString() {
		return "Casa [tamanio=" + tamanio + ", direccion=" + direccion + "]";
	   }

	   @Override
	   public int hashCode() {
		return Objects.hash(direccion, tamanio);
	   }

	   @Override
	   public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Casa other = (Casa) obj;
		return Objects.equals(direccion, other.direccion) && tamanio == other.tamanio;
	   } 
	   
	   
	
	}
}
