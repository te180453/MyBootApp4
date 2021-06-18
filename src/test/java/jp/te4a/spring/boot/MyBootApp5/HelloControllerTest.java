package jp.te4a.spring.boot.MyBootApp5;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.Map;

import org.junit.Test;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

/**
 * Unit test for simple App.
 */
public class HelloControllerTest
{
    /**
     * Rigorous Test :-)
     */
    HelloController hc = new HelloController();
    @Test
    public void test1()
    {
        String actual = hc.index(new TestModel());
        String expected = "index";
        assertEquals(expected, actual);
    }

    @Test
    public void test2()
    {
        String expected = "hello";
        ModelAndView mv = hc.postForm(expected);
        String actual = (String)mv.getModel().get("msg");
        assertEquals(String.format("you write %s!!!",expected), actual);
    }
}

class TestModel implements Model{

    @Override
    public Model addAttribute(String attributeName, Object attributeValue) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Model addAttribute(Object attributeValue) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Model addAllAttributes(Collection<?> attributeValues) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Model addAllAttributes(Map<String, ?> attributes) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Model mergeAttributes(Map<String, ?> attributes) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean containsAttribute(String attributeName) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Object getAttribute(String attributeName) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Map<String, Object> asMap() {
        // TODO Auto-generated method stub
        return null;
    }
    
}