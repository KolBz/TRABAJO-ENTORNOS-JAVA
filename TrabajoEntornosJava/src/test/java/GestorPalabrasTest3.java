/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.mycompany.trabajoentornosjava.GestorPalabras;
import static junit.framework.TestCase.assertEquals;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author daylto
 */
public class GestorPalabrasTest3 {
     @Test
    public void invertirPalabras(){
        GestorPalabras GestorPalabras1 = new GestorPalabras();
        assertEquals("lAt eUQ aloH",GestorPalabras1.invertirPalabra("Hola QUe tAl"));//DA ERROR Y DEBE DE DAR BIEN // YA DA BIEN
        
        
    }
    @Test
    public void numeros(){
        GestorPalabras GestorPalabras2 = new GestorPalabras();
     //    assertEquals("5678910 39082 28 390",GestorPalabras2.invertirPalabra("5678910 39082 28 390")); //DA ERROR Y DEBE DAR ERROR
         assertEquals("093 82 28093 0198765",GestorPalabras2.invertirPalabra("5678910 39082 28 390")); // DA BIEN Y DEBIA DAR BIEN
    }
    @Test
    public void acentuacion(){
        GestorPalabras GestorPalabras2 = new GestorPalabras();
        //assertEquals("éqÜe es   ¿¿¿´´´´ !! éóá 56",GestorPalabras2.invertirPalabra("65 áóé !! ´´´´¿¿¿   se eÜqé")); // DA BIEN Y DEBE DE DAR BIEN 
        assertEquals("éqÜe es     !!! sldml, ",GestorPalabras2.invertirPalabra("65 áóé !! ´´´´ ¿¿¿   se eÜqé")); // DA ERROR Y DEBE DE DAR ERROR
    }
    
}
