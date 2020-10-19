package config;

import components.printers.ConsolePrinter;
import components.printers.DialogPrinter;
import components.printers.FilePrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import warmup.HelloWorld;


@Configuration
//wskazanie klas z componentami
@ComponentScan(basePackages = {"components.printers","warmup"})
public class WarmUpConfiguration {
    @Bean
    public HelloWorld helloBean () {
        return new HelloWorld();
    }
    @Bean HelloWorld buzzBuzz () {
        return new HelloWorld();
    }
//    @Bean
//    public ConsolePrinter consolePrinter (){
//        return new ConsolePrinter();
//    }
//    @Bean
//    public FilePrinter filePrinter () {
//        return new FilePrinter();
//    }
//    @Bean
//    public DialogPrinter dialogPrinter () {
//        return new DialogPrinter();
//    }

}
