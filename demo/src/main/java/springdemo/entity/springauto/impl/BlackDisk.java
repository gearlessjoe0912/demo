package springdemo.entity.springauto.impl;

import springdemo.entity.springauto.inter.CompactDisc;

import java.util.List;

public class BlackDisk implements CompactDisc {

    private String title;

    private String artist;

    private List<String> tracks;

    public BlackDisk(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("playing " + title + "by" + artist);
        tracks.forEach(str -> {
            System.out.println("track : " + str);
        });
    }
}
