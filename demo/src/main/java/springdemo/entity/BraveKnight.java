package springdemo.entity;

import springdemo.api.Knight;
import springdemo.api.Quest;

public class BraveKnight implements Knight {

    private Quest quest;
    private Minstrel minstrel;

    public BraveKnight(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel = minstrel;
    }

    public void embarkOnQuest() {
        quest.embark();
    }

}
