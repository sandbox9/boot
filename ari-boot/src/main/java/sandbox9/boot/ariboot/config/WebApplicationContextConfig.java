package sandbox9.boot.ariboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//XML Based Configuration
@ImportResource("classpath:/applicationContext-servlet.xml")
public class WebApplicationContextConfig {
	
}
