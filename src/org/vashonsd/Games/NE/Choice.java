package org.vashonsd.Games.NE;

import java.util.Random;

public class Choice {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChoiceType getWinCase() {
        return winCase;
    }

    public void setWinCase(ChoiceType winCase) {
        this.winCase = winCase;
    }

    public ChoiceType getTieCase() {
        return tieCase;
    }

    public void setTieCase(ChoiceType tieCase) {
        this.tieCase = tieCase;
    }

    public ChoiceType getLoseCase() {
        return loseCase;
    }

    public void setLoseCase(ChoiceType loseCase) {
        this.loseCase = loseCase;
    }

    public ChoiceType getMyType() {
        return myType;
    }

    public void setMyType(ChoiceType myType) {
        this.myType = myType;
    }

    private String name;
    private ChoiceType myType;
    private ChoiceType winCase;
    private ChoiceType tieCase;
    private ChoiceType loseCase;

    public Choice(String name) {
        this.name = name;
    }

    public String determineWinner(Choice c) {
        if(this.getWinCase() == c.getMyType()) {
            return "You Win!";
        } else if (this.getLoseCase() == c.getMyType()) {
            return "You Lose!";
        } else {
            return "You Tied!";
        }
    }
}
