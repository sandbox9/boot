package sandbox9.boot.ariboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by chanwook on 2014. 12. 18..
 */
@ComponentScan(basePackages = {"sandbox9.boot.ariboot."})
@EnableAutoConfiguration
public class AriSiteApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(AriSiteApplication.class, args);
    }
}
