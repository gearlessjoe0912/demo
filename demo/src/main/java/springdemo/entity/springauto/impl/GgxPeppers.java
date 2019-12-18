package springdemo.entity.springauto.impl;

import org.springframework.stereotype.Component;
import springdemo.entity.springauto.inter.CompactDisc;

/**
 * 高跟鞋
 */
@Component
public class GgxPeppers implements CompactDisc {
    private String title = "高跟鞋";
    private String artist = "蔡卓妍";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
