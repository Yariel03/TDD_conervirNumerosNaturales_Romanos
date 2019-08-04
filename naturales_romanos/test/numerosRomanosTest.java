/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alex-
 */
public class numerosRomanosTest {
      private ClnumeroRomanos numRomanos=new ClnumeroRomanos();
//    public numerosRomanosTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//     
//    }
//    
//    @After
//    public void tearDown() {
//    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
  
    @Test
    public void pasar1aRomano(){
        String romano=numRomanos.convertirAromanos(1);
        assertEquals(romano, "I");
    }
    
    @Test
    public void pasar2aRomano(){
        String romano=numRomanos.convertirAromanos(2);
        assertEquals(romano, "II");
    }
    @Test
    public void pasar3aRomano(){
        String romano=numRomanos.convertirAromanos(3);
        assertEquals(romano, "III");
    }
    @Test
    public void pasar4aRomano(){
        String romano=numRomanos.convertirAromanos(4);
        assertEquals(romano, "IV");
    }
    @Test
    public void pasar5aRomano(){
        String romano=numRomanos.convertirAromanos(5);
        assertEquals(romano, "V");
    }
    @Test
    public void pasar6aRomano(){
        String romano=numRomanos.convertirAromanos(6);
        assertEquals(romano, "VI");
    }
    @Test
    public void pasar7aRomano(){
        String romano=numRomanos.convertirAromanos(7);
        assertEquals(romano, "VII");
    }
    @Test
    public void pasar8aRomano(){
        String romano=numRomanos.convertirAromanos(8);
        assertEquals(romano, "VIII");
    }
    @Test
    public void pasar9aRomano(){
        String romano=numRomanos.convertirAromanos(9);
        assertEquals(romano, "IX");
    }
    @Test
    public void pasar10aRomano(){
        String romano=numRomanos.convertirAromanos(10);
        assertEquals(romano, "X");
    }

}
