import m05_act3.M05_Act3;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ALUMNEDAM
 */
public class test_uf {
    
    public test_uf() {
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

    @Test
    public final void testCalculaPrecio() throws CalculaPrecioException {
        M05_Act3 utils = new M05_Act3();
        assertEquals(0, utils.calculauf(0), 0);
    }
    
    @Test
    public final void testCalculaPrecio1() throws CalculaPrecioException {
        M05_Act3 utils = new M05_Act3();
        assertEquals(300, utils.calculauf(10), 0);
    }
    
    @Test
    public final void testCalculaPrecio2() throws CalculaPrecioException {
        M05_Act3 utils = new M05_Act3();
        assertEquals(380, utils.calculauf(100), 0);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
