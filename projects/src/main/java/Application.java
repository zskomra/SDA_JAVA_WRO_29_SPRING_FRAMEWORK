import org.springframework.context.support.GenericApplicationContext;
import warmup.HelloWorld;

public class Application {
    public static void main(String[] args) {

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