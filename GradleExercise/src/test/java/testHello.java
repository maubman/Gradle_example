import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class testHello {
    @Before
    public void beforeTestDo(){
        System.out.println("Antes de las pruebas");
    }
    @Test
    public void testGet (){
        System.out.println("This is a test");
        assertEquals ("Hello Mundito", new Hello().getHello());
    }

    @After
    public void afterTestDo(){
        System.out.println("Despues de la prueba");
    }
}
