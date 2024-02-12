
import com.mycompany.trabajoentornosjava.GestorPalabras;
import static junit.framework.TestCase.assertEquals;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daylto
 */
public class GestorPalabrasTest {
    @Test
    public void esPalindromo(){
        //PREGUNTAR SI TIENE QUE DAR BIEN EN LAS FRASES PALINDROMAS
        GestorPalabras GestorPalabras1 = new GestorPalabras();
        assertEquals(true, GestorPalabras1.esPalindromo("Yo hago yoga hoy")); //A salido bien
        assertEquals(true, GestorPalabras1.esPalindromo("oso esse oso"));     // A salido bien y debia haber salido error   
        assertEquals(false, GestorPalabras1.esPalindromo("oso esse oso")); //A salido error y deberia haber salido bien
        assertEquals(true, GestorPalabras1.esPalindromo("holaquetal")); // error y debia salir error
        assertEquals(false, GestorPalabras1.esPalindromo("sorpresa")); // a salido bien y tenia que salir b ien
        assertEquals(false, GestorPalabras1.esPalindromo("ospoopso")); // A salido error y debia de salir error
        assertEquals(true, GestorPalabras1.esPalindromo("olo")); //A salido bien y tenia que salir bien
        
    }
    
    public void esPalindromoConTildes() {
    
    }
    
    public void vacio() {
    
    }
    
    public void numeros(){
    
    }
    
}
