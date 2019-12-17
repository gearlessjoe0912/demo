package springdemo.entity.aware;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemo.entity.BraveKnight;

public class ApplicationAware {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBeanNameAware testBeanNameAware = classPathXmlApplicationContext.getBean(TestBeanNameAware.class);
        System.out.println("testBeanNameAware id = " + testBeanNameAware.getId());

    }
}
