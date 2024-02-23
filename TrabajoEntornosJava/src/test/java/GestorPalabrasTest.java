
import com.mycompany.trabajoentornosjava.GestorPalabras;
import com.mycompany.trabajoentornosjava.exception;
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
    public void esPalindromo() throws exception.NumeroPalindromo {
        GestorPalabras GestorPalabras1 = new GestorPalabras();
        assertEquals(true, GestorPalabras1.esPalindromo("Yo hago yoga hoy")); //A salido bien
        assertEquals(true, GestorPalabras1.esPalindromo("oso esse oso"));     // A salido bien y debia haber salido bien  
        assertEquals(true, GestorPalabras1.esPalindromo("holaquetal")); // error y debia salir error
        assertEquals(false, GestorPalabras1.esPalindromo("sorpresa")); // a salido bien y tenia que salir b ien
        assertEquals(false, GestorPalabras1.esPalindromo("ospoopso")); // A salido error y debia de salir error
        assertEquals(true, GestorPalabras1.esPalindromo("olo")); //A salido bien y tenia que salir bien

    }

    @Test 
    public void esPalindromoConTildes() throws exception.NumeroPalindromo {
        GestorPalabras GestorPalabras2 = new GestorPalabras();
        assertEquals(true, GestorPalabras2.esPalindromo("Adán no cede con Eva y Yavé no cëde cÒn nâda")); // a dado bien y debe de dar bien

    }

    @Test 
    public void esPalindromoConComas() throws exception.NumeroPalindromo {
        GestorPalabras GestorPalabras3 = new GestorPalabras();
        assertEquals(true, GestorPalabras3.esPalindromo("Adán no, (cede con Eva) y Yavé no cËde con nada.")); //da bien y debe de dar bien
    }

    @Test 
    public void vacio() throws exception.NumeroPalindromo {
        GestorPalabras GestorPalabras4 = new GestorPalabras();
        assertEquals(false, GestorPalabras4.esPalindromo("    ´´´´´´´´¨¨E*+E     "));//DA BIEN Y DEBE DE DAR BIEN  //DA BIEN Y DEERIA DAR MAL CREO QUE NO HE QUITADO LOS + Y LOS *
        assertEquals(false, GestorPalabras4.esPalindromo("    ´´´´´´´´¨¨E*+     "));//DA BIEN Y DEBE DE DAR BIEN 
        assertEquals(true, GestorPalabras4.esPalindromo("             ")); //DA MAL Y DEBE DE DAR MAL
    }

    @Test (expected = exception.NumeroPalindromo.class)
    public void numeros() throws exception.NumeroPalindromo {
        GestorPalabras GestorPalabras5 = new GestorPalabras();
//        assertEquals(true, GestorPalabras5.esPalindromo("98589")); //DA BIEN Y DEBE DE DAR BIEN
//        assertEquals(true, GestorPalabras5.esPalindromo("985489")); //DA MAL Y DEBE DE DAR MAL
          String numero ="12345";
          try{
              GestorPalabras5.esPalindromo(numero);
          }  catch (exception.NumeroPalindromo e ){
              assertEquals("los números no son palindromos", e.getMessage());
          }
    }

}
