package jp.te4a.spring.boot.MyBootApp5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController{
    
    @RequestMapping("/")
    public String index(Model model){
        return "index";
    }
}