package org.vashonsd.Games.NE;

public class Rock extends Choice{

    public Rock() {
        super("rock");
        setMyType(ChoiceType.ROCK);
        setWinCase(ChoiceType.SCISSORS);
        setLoseCase(ChoiceType.PAPER);
    }
}
