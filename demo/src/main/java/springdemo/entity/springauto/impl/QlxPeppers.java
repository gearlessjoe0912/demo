package springdemo.entity.springauto.impl;

import org.springframework.stereotype.Component;
import springdemo.entity.springauto.inter.CompactDisc;

/**
 * 七里香
 */
public class QlxPeppers implements CompactDisc {

    private String title = "七里香";

    public QlxPeppers(String title) {
        this.title = title;
    }

    private String artist = "周杰伦";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
