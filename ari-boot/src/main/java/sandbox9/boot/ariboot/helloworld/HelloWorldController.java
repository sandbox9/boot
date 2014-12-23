package sandbox9.boot.ariboot.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import sandbox9.boot.service.HelloService;

/**
 * Created by chanwook on 2014. 12. 18..
 */
@Controller
public class HelloWorldController {

	@Autowired
	private HelloService helloService;
	

    @RequestMapping(value = "/hello")
    public String greeting(ModelMap map) {
    	
    	map.addAttribute("message", helloService.greeting());
    	
        return "hello";
    }
}
