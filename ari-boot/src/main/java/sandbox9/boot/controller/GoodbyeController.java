package sandbox9.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoodbyeController {
	
    @RequestMapping(value = "/goodbye")
    public String greeting() {
    	
        return "goodbye";
    }
}
