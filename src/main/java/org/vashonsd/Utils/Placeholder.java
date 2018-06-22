package org.vashonsd.Utils;

/**
 * Created by andy on 5/2/18.
 */
public abstract class Placeholder extends Minigame {


    public Placeholder(String name) {
        super(name, "A simple game in which you guess " + name + "'s name", "quit");
    }

    @Override
    public String start() {
        return "Hi! My name is " + name + "!" +
                "\nAre you ready for a quiz?" +
                "\nWhat's my name?";
    }

    @Override
    public String handle(String str) {
        if(str.equalsIgnoreCase(name)) {
            return "Fantastic! Guess again, or type " + quitWord + " to quit!";
        } else {
            return "Nope! Guess again!";
        }
    }

    @Override
    public String quit() {
        return "Thanks for playing with me, " + name + "!";
    }
}
