package core;

import core.config.WarmUpConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import core.warmup.HelloWorld;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WarmUpConfiguration.class);
        //Bean z klasy konfiguracyjnej z adnotacja ComponentScan
        HelloWorld helloBean = context.getBean("helloBean",HelloWorld.class);
        helloBean.sayHello();
        //Bean z klasy zawierajacej Component nazwa taka jak klasa
        HelloWorld helloWorld = context.getBean("helloWorld",HelloWorld.class);
        helloWorld.sayHello();
        //Bean beanowi nierowny jezeli pobierany z roznych klas
        System.out.println(helloWorld == helloBean);

        HelloWorld helloBean1 = context.getBean("helloBean",HelloWorld.class);

        HelloWorld helloWorld1 = context.getBean("helloWorld",HelloWorld.class);
        //Bean benowi rowny jezeli pobierany z tych samych klas
        System.out.println(helloBean == helloBean1);
        System.out.println(helloWorld == helloWorld1);
        //Nie da pobrac sie beana z nazwa jezeli owa nie jest utworzona
        HelloWorld helloBuzz = context.getBean("buzzBuzz",HelloWorld.class);
        helloBuzz.sayHello();
        //Nie mozna pobrac beana jezeli jest zadeklarowany w roznych miejscach
        //trzeba podac nazwe o ktory bean nam chodzi mimo ze zwracaja to samo
        try {
            HelloWorld whichOne = context.getBean(HelloWorld.class);
            whichOne.sayHello();
        } catch (RuntimeException re) {
//            re.printStackTrace();
            System.err.println(re.getLocalizedMessage());
        }

    }
    private static void classPathWarmUp() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld bean = context.getBean(HelloWorld.class);
        bean.sayHello();

    }

    private static void genericWarmUp() {
        GenericApplicationContext context = new GenericApplicationContext();
        context.registerBean("helloWorld", HelloWorld.class);
        context.refresh();

        HelloWorld bean = (HelloWorld) context.getBean("helloWorld");
        bean.sayHello();

        bean = context.getBean("helloWorld",HelloWorld.class);
        bean.sayHello();

        bean = context.getBean(HelloWorld.class);
        bean.sayHello();
    }

}
