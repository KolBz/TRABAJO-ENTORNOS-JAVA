
import static junit.framework.TestCase.assertEquals;
import org.junit.Assert;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author dev
 */
public class GestorPalabrasTest {

    @Test
    public void contarVocalesTest() { //PREGUNTAR A ISMA SI CONTARVOCALES DEBERIA CONTAR LAS VOCALES DE UNA PALABRA O DE UNA FRASE?

        GestorPalabras GestorPalabras1 = new GestorPalabras();
        assertEquals(5, GestorPalabras1.contarVocales("Star Dust crusaders"));
        
    }
    /* errores contador vocales -> en el if de la linea 17, 
sobra la ! y hay que añadir otro =, hay que reemplazar el & por || y añadir 
contador++ dentro del ultimo if.  Meter vocales cirilicas y chinas(?) , tildes y dieresis.  */

}
