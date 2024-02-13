package com.mycompany.trabajoentornosjava;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class GestorPalabras {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String palabra = sc.nextLine();
//        String resultado = esPalindromo(palabra);
//        System.out.println("la frase modificada es:" + resultado);
//    }
    public boolean esPalindromo(String palabra) { // DAYLTO 
        String palabraFormateada = "";
        palabra = palabra.toUpperCase();
        palabra = deAccent(palabra);
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
    public String deAccent(String str) { // quitar los acentos y diéresis
      String nfdNormalizedString = Normalizer.normalize(str,  Normalizer.Form.NFD); 
      Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
      return pattern.matcher(nfdNormalizedString).replaceAll("");
}

    public int contarVocales(String palabra) { ///YO 
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = Character.toLowerCase(palabra.charAt(i));
            if (esVocal(caracter)) {
                contador++;
            }
        }
        return contador;
    }
    public boolean esVocal(char caracter) {
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'а', 'е', 'є', 'и', 'і', 'ї', 'о', 'у', 'ю', 'я', 'á', 'é', 'í', 'ó', 'ú', 'ü'};
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
        for (int i = palabra.length() - 2; i >= 0; i--) {
            resultado.append(palabra.charAt(i));
        }
        return resultado.toString();
    }
}
/* errores contador vocales -> en el if de la linea 17, 
sobra la ! y hay que añadir otro =, hay que reemplazar el & por || y añadir 
contador++ dentro del ultimo if.  Meter vocales cirilicas y chinas(?) , tildes y dieresis.  */