package org.vashonsd.Games;

public class Demon implements Personality {
    @Override
    public String greet() {
        return "Bow before me!";
    }

    @Override
    public String challenge() {
        return "Don't hurt me! I'm very sensitive.";
    }

    @Override
    public String flatter() {
        return "You are right to flatter me.";
    }
}
