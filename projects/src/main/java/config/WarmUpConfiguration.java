package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import warmup.HelloWorld;


@Configuration
@ComponentScan(basePackages = "warmup")
public class WarmUpConfiguration {
    @Bean
    public HelloWorld helloBean () {
        return new HelloWorld();
    }
    @Bean HelloWorld buzzBuzz () {
        return new HelloWorld();
    }

}
