import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class TestPrueba {
    @Before
    public void beforeTestDo(){
        System.out.println("Antes de las pruebas");
    }
    @Test
    public void testPrueba1 (){
        System.out.println("This is a test");
        assertEquals (true);
    }

    @After
    public void afterTestDo(){
        System.out.println("This should appear after test1");
    }
}
