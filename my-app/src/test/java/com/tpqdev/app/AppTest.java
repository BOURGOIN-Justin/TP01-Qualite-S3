package com.tpqdev.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    // test permattant de vérifier que l'addition s'effectue correctement
    @Test    
    public void testAd() {

        Add calc = new Add();
        
     
        int resultat = calc.add(2, 3);
        
        // Assert : Vérification du résultat
        assertEquals(5, resultat, "2 + 3 doit être égal à 5");
    }
    @Test
    public void subTest1() {
        int a = 80;
        int b = 12;
        int result = 68;

        int found = Sub.sub(a, b);

        assertEquals(result, found);
    }
}

