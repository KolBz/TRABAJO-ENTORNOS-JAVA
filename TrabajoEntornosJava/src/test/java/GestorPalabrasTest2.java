
import com.mycompany.trabajoentornosjava.GestorPalabras;
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
public class GestorPalabrasTest2 {

    @Test
    public void contarVocalesTest() { // funciona bien. 

        GestorPalabras GestorPalabras1 = new GestorPalabras();
        assertEquals(5, GestorPalabras1.contarVocales("Contigo pipo")); 
    }
    
     @Test
    public void contarVocalesCirilicas(){ // no funciona, mi teoria es que la letra 'й' la lee como 'и', me recuerda al caso de la 'ñ'.
        GestorPalabras GestorPalabras2 = new GestorPalabras();
        assertEquals(1, GestorPalabras2.contarVocales("хуй"));
    }
    @Test
    public void contarVocalesConTildes(){ // funciona bien.
        GestorPalabras GestorPalabras3 = new GestorPalabras();
        assertEquals(11, GestorPalabras3.contarVocales("Cogí el autobús y tardé menos"));
    }
    
    @Test
    public void contarVocalesConComasyPuntos(){ // funciona de lujo.
        GestorPalabras GestorPalabras4 = new GestorPalabras();
        assertEquals(19, GestorPalabras4.contarVocales("Puff, soy Josuke literal. Anuel AA feat Malenia "));
    }
    
    @Test
    public void contarVocalesConDieresis(){ // funciona bastante bien.
        GestorPalabras GestorPalabras5 = new GestorPalabras();
        assertEquals(13,GestorPalabras5.contarVocales("La cigüeña que luchó contra Gael"));
    }
    
    @Test
    public void contarVocalesError(){ //funciona bien, hay 13 vocales en realidad.
        GestorPalabras GestorPalabras6 = new GestorPalabras();
        assertEquals(2, GestorPalabras6.contarVocales("Is this the blood, the blood of the dark souls"));
    }

}
