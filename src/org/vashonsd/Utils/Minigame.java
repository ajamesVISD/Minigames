package org.vashonsd.Utils;

/**
 * Created by andy on 5/2/18.
 */
public abstract class Minigame {
    protected String name;
    protected String description;
    protected String quitWord;

    public Minigame(String name, String description, String quitWord) {
        this.name = name;
        this.description = description;
        this.quitWord = quitWord;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getQuitWord() {
        return this.quitWord;
    }

    public abstract String start();

    public abstract String handle(String str);

    public abstract String quit();
}
