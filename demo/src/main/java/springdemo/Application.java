package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemo.entity.BraveKnight;
import springdemo.entity.DemoConfig;
import springdemo.entity.Test;

public class Application {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        BraveKnight quest = (BraveKnight) classPathXmlApplicationContext.getBean("braveKnight");
//        quest.embarkOnQuest();

        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(DemoConfig.class);
        Test bean = configApplicationContext.getBean(Test.class);
        bean.say();;

    }
}
