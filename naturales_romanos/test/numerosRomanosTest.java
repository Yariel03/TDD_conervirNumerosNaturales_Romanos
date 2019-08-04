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

}
