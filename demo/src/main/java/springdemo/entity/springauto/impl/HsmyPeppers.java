package springdemo.entity.springauto.impl;

import org.springframework.stereotype.Component;
import springdemo.entity.springauto.inter.CompactDisc;

/**
 * 黑色毛衣
 */
@Component
public class HsmyPeppers implements CompactDisc {
    private String title = "黑色毛衣";
    private String artist = "周杰伦";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
