package springdemo.entity;

import java.io.PrintStream;

public class Minstrel {

    private PrintStream printStream;

    public Minstrel(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void singBeforeQuest() {
        printStream.println("星星点灯");
    }

    public void singAfterQuest() {
        printStream.println("照亮我的心门");
    }
}
