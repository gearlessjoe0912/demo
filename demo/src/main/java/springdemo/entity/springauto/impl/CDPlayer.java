package springdemo.entity.springauto.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springdemo.entity.springauto.inter.CompactDisc;
import springdemo.entity.springauto.inter.MediaPlayer;

@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }
//    @Autowired
//    public void setCompactDisc(CompactDisc compactDisc) {
//        this.compactDisc = compactDisc;
//    }

    public void play() {
        compactDisc.play();
    }
}
