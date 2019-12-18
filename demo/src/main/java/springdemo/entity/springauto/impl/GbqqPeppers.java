package springdemo.entity.springauto.impl;

import org.springframework.stereotype.Component;
import springdemo.entity.springauto.inter.CompactDisc;

/**
 * 告白气球
 */
@Component
public class GbqqPeppers implements CompactDisc {
    private String title = "告白气球";
    private String artist = "周杰伦";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
