package springdemo.entity.springauto;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import springdemo.entity.springauto.inter.CompactDisc;
import springdemo.entity.springauto.inter.MediaPlayer;

import java.util.Arrays;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = CDPlayerConfig.class)
//@ContextConfiguration("classpath:applicationContext.xml")
@ContextConfiguration("classpath:cotext_01.xml")
public class CDPlayerTest implements ApplicationContextAware {

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private MediaPlayer mediaPlayer;

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void cdShouldNotBeNull() {
        Assert.assertNotNull(compactDisc);
    }

    @Test
    public void listBeans() {
        Assert.assertNotNull(applicationContext);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        List<String> asList = Arrays.asList(beanDefinitionNames);
        asList.forEach(str -> {
            System.out.println("str = " + str);
        });
    }

    @Test
    public void testMethodAuto() {
        Assert.assertNotNull(mediaPlayer);
        mediaPlayer.play();
    }

    @Test
    public void testCompactDisc() {
        Assert.assertNotNull(compactDisc);
        compactDisc.play();
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
