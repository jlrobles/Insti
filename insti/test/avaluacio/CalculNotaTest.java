/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package avaluacio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 46786783e
 */
public class CalculNotaTest {
    
    public CalculNotaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class CalculNota.
     */
    @Test
    public void testMain() {}

    /**
     * Test of calculaNota method, of class CalculNota.
     */
    @Test
    public void testCalculaNota_C2() {
        assertEquals(-1, CalculNota.calculaNota("M","UF1", new int[]{1,2,3,4,5,6}));
    }
    /**
     * Test of calculaNota method, of class CalculNota.
     */
    @Test
    public void testCalculaNota_C3() {
        assertEquals(5, CalculNota.calculaNota("M05","UF1", new int[]{5,5,5,5,5,5}));
    }
    /**
     * Test of calculaNota method, of class CalculNota.
     */
    @Test
    public void testCalculaNota_C4() {
        assertEquals(5, CalculNota.calculaNota("M05","UF2", new int[]{5,5,5,5,5,5}));
    }
    /**
     * Test of calculaNota method, of class CalculNota.
     */
    @Test
    public void testCalculaNota_C5() {
        assertEquals(5, CalculNota.calculaNota("M05","UF3", new int[]{5,5,5,5,5,5}));
    }
    /**
     * Test of calculaNota method, of class CalculNota.
     */
    @Test
    public void testCalculaNota_C6() {
        assertEquals(-2, CalculNota.calculaNota("M05","UFZ", new int[]{5,5,5,5,5,5}));
    }
    @Test
    public void testCalculaNota_C8() {
        assertEquals(-3, CalculNota.calculaNota("M05","UFZ", new int[]{1,5,5,5,5,5}));
    }
    @Test
    public void testCalculaNota_C9() {
        assertEquals(-4, CalculNota.calculaNota("M05","UF1", new int[]{5}));
    }
    @Test
    public void testCalculaNota_C10() {
        assertEquals(-4, CalculNota.calculaNota("M05","UF2", new int[]{5}));
    }
    @Test
    public void testCalculaNota_C11() {
        assertEquals(-4, CalculNota.calculaNota("M05","UF3", new int[]{5}));
    }


}
