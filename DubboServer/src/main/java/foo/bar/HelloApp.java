package foo.bar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        context.start();

        System.out.println("Dubbo Server Start");
        try {
            System.in.read();
        }catch (Exception e) {
            e.printStackTrace();
        }


    }
}
