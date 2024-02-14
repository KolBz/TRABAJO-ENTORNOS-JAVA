package com.mycompany.trabajoentornosjava;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class GestorPalabras {

    public boolean esPalindromo(String palabra) { // DAYLTO 
        String palabraFormateada = "";
        palabra = palabra.toUpperCase(); // HE QUITADO EL REPLACEALL
        palabra = deAccent(palabra);    //LE HE QUITADO LOS ACENTOS, A LA PALABRA
        
        for (int i = 0; i < palabra.length(); i++) { // SE LE QUITA LOS ESPAIOS, LAS COMASS, LOS PUNTOS, LAS ALMOADILLAS, LOS ";", LOS ":", LOS IGUALES, LOS PARENTESIS, ETC.
            if(!(palabra.charAt(i) >= 32 & palabra.charAt(i) <=47)||(palabra.charAt(i) >=58 && palabra.charAt(i) <=64)) palabraFormateada += ""+palabra.charAt(i); 
        }
        for (int i = 0; i < palabraFormateada.length() / 2; i++) { //LA PALABRA YA ESTA LIMPIA Y COMPROBAMOS SI ES PALINDROMA O NO
            if (palabraFormateada.charAt(i) != palabraFormateada.charAt(palabraFormateada.length() - i - 1)) {
                return false;
            }
        }
        if(palabraFormateada.length()<2) return false;
        return true;
    }

    public int contarVocales(String palabra) { ///YO 
        int contador = 0;
        palabra = deAccent(palabra);
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = Character.toLowerCase(palabra.charAt(i));
            if (esVocal(caracter)) {
                contador++;
            }
        }
        return contador;
    }
    public boolean esVocal(char caracter) {
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'а', 'е', 'є', 'и', 'і', 'ї', 'о', 'у', 'ю', 'я'};
        int i = 0;
        boolean encontrado = false;
        while (i < vocales.length && !encontrado) {
            if (vocales[i] == caracter) {
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }
    
    public String invertirPalabra(String palabra) {
        StringBuilder resultado = new StringBuilder();
        for (int i = palabra.length() - 1; i >= 0; i--) { // SE HA CAMBIADO DE -2 A -1 
            resultado.append(palabra.charAt(i));
        }
        return resultado.toString();
    }
    
    
    public String deAccent(String str) { // METODO PARA QUITAS LOS ACENTOS
      String nfdNormalizedString = Normalizer.normalize(str,  Normalizer.Form.NFD); 
      Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
      return pattern.matcher(nfdNormalizedString).replaceAll("");
    }
    
    
}
/* errores contador vocales -> en el if de la linea 17, 
sobra la ! y hay que añadir otro =, hay que reemplazar el & por || y añadir 
contador++ dentro del ultimo if.  Meter vocales cirilicas y chinas(?) , tildes y dieresis.  */