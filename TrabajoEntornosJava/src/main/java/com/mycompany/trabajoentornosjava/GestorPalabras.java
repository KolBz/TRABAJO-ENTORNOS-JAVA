package com.mycompany.trabajoentornosjava;

import java.text.Normalizer;

public class GestorPalabras {

    public boolean esPalindromo(String palabra) { // DAYLTO
        String palabraFormateada = "";
        palabra = palabra.toUpperCase();
        palabra = Normalizer.normalize(palabra, Normalizer.Form.NFD);
        //String palabraFormateada = palabra.replaceAll("//+S","");
//        palabraFormateada = palabraFormateada.replaceAll(".","");
//        palabraFormateada = palabraFormateada.replaceAll(",","");
//        palabraFormateada = palabraFormateada.replaceAll(".",":");
//        palabraFormateada = palabraFormateada.replaceAll(".",";");
        for (int i = 0; i < palabra.length(); i++) {
            if(!(palabra.charAt(i) >= 32 & palabra.charAt(i) <=47)||(palabra.charAt(i) >=58 && palabra.charAt(i) <=64)) palabraFormateada += ""+palabra.charAt(i);
        }
        for (int i = 0; i < palabraFormateada.length() / 2; i++) {
            if (palabraFormateada.charAt(i) != palabraFormateada.charAt(palabraFormateada.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public int contarVocales(String palabra) { ///YO 
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = Character.toLowerCase(palabra.charAt(i));
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public String invertirPalabra(String palabra) {
        StringBuilder resultado = new StringBuilder();
        for (int i = palabra.length() - 2; i >= 0; i--) {
            resultado.append(palabra.charAt(i));
        }
        return resultado.toString();
    }
}
/* errores contador vocales -> en el if de la linea 17, 
sobra la ! y hay que añadir otro =, hay que reemplazar el & por || y añadir 
contador++ dentro del ultimo if.  Meter vocales cirilicas y chinas(?) , tildes y dieresis.  */