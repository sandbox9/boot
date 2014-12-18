package sandbox9.boot.ariboot.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chanwook on 2014. 12. 18..
 */
@Controller
public class HelloWorldController {

    @RequestMapping(value = "/hello")
    public String greeting() {
        return "hello";
    }
}
