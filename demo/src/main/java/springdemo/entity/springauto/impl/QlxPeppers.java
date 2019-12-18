package springdemo.entity.springauto.impl;

import org.springframework.stereotype.Component;
import springdemo.entity.springauto.inter.CompactDisc;

/**
 * 七里香
 */
//@Component
public class QlxPeppers implements CompactDisc {
    private String title = "七里香";
    private String artist = "周杰伦";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
