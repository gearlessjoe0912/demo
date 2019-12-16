package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemo.entity.SlayDragonQuest;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SlayDragonQuest quest = (SlayDragonQuest) classPathXmlApplicationContext.getBean("quest");
        quest.embark();
    }
}
