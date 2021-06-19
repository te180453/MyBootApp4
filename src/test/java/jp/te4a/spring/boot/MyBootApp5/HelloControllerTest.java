package jp.te4a.spring.boot.MyBootApp5;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.Map;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.ui.Model;

/**
 * Unit test for simple App.
 */
// NOTE これはテスト対象外
public class HelloControllerTest
{
    HelloController hc = new HelloController();


    @Test
    public void test1()
    {   
        Model testModel = new Model(){

            @Override
            public Model addAttribute(String attributeName, Object attributeValue) {
                return null;
            }

            @Override
            public Model addAttribute(Object attributeValue) {
                return null;
            }

            @Override
            public Model addAllAttributes(Collection<?> attributeValues) {
                return null;
            }

            @Override
            public Model addAllAttributes(Map<String, ?> attributes) {
                return null;
            }

            @Override
            public Model mergeAttributes(Map<String, ?> attributes) {
                return null;
            }

            @Override
            public boolean containsAttribute(String attributeName) {
                return false;
            }

            @Override
            public Object getAttribute(String attributeName) {
                return null;
            }

            @Override
            public Map<String, Object> asMap() {
                return null;
            }
        };
        String actual = hc.index(testModel);
        String expected = "index";
        assertEquals(expected, actual);
    }
}