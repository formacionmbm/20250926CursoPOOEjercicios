package com.proyecto;

import com.proyecto.common.PalabrasNoPermitidas;

public class Test2 {
    public static void main(String[] args) {
        PalabrasNoPermitidas[] palabra = PalabrasNoPermitidas.values();
        String cadena = "La palabra hola no esta permitida";
        for (PalabrasNoPermitidas p : palabra) {
            if (cadena.toUpperCase().contains(p.name())) {
                System.out.println("La cadena contiene una palabra no permitida: " + p.name());
            }
        }
    }
}
