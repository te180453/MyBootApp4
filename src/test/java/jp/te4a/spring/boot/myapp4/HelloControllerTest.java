package jp.te4a.spring.boot.myapp4;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class HelloControllerTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        HelloController helloController = new HelloController();
        String expected = "this is Spring Boot sample";
        String actual = helloController.index();
        
        assertEquals(expected,actual);
    }
}
