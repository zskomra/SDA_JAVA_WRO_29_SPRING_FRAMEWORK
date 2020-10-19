package core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
//wskazanie klas z componentami
@ComponentScan(basePackages = "core")
public class WarmUpConfiguration {
//    @Bean
//    public HelloWorld helloBean () {
//        return new HelloWorld();
//    }
//    @Bean HelloWorld buzzBuzz () {
//        return new HelloWorld();
//    }
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
