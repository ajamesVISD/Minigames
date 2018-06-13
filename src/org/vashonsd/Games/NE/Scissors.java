package org.vashonsd.Games.NE;

public class Scissors extends Choice{

    public Scissors() {
        super("scissors");
        setMyType(ChoiceType.SCISSORS);
        setWinCase(ChoiceType.PAPER);
        setLoseCase(ChoiceType.ROCK);
    }
}