package jp.te4a.spring.boot.MyBootApp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
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
    @InjectMocks
    HelloController hc; 

    @BeforeEach
    public void each(){
        MockitoAnnotations.openMocks(this);
    }

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
    
}