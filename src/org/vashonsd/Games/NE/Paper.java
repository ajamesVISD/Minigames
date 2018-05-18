package org.vashonsd.Games.NE;

public class Paper extends Choice {

    public Paper() {
        super("paper");
        setMyType(ChoiceType.PAPER);
        setLoseCase(ChoiceType.SCISSORS);
        setWinCase(ChoiceType.ROCK);
    }
}
