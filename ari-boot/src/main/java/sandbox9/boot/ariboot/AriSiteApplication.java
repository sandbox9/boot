package sandbox9.boot.ariboot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import sandbox9.boot.ariboot.config.RootApplicationContextConfig;
import sandbox9.boot.ariboot.config.WebApplicationContextConfig;

/**
 * Created by chanwook on 2014. 12. 18..
 */
@Configuration
@ComponentScan(basePackages = {"sandbox9.boot.ariboot."})
@EnableAutoConfiguration
public class AriSiteApplication {
	
	public static void main(String[] args) {

		new SpringApplicationBuilder()
				.showBanner(false)
				.sources(RootApplicationContextConfig.class)
				.child(WebApplicationContextConfig.class, AriSiteApplication.class)
				.run(args);
	}
}