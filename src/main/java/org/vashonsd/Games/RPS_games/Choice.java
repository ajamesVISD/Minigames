package org.vashonsd.Games.RPS_games;

/**
 * Created by andy on 5/10/18.
 */
public class Choice {


    private final int LOSE = -1;
    private final int TIE = 0;
    private final int WIN = 1;

    private String name;
    private ChoiceType type;

    private ChoiceType winCase;
    private ChoiceType loseCase;

    public Choice(String name, ChoiceType type, ChoiceType winCase, ChoiceType loseCase) {
        this.name = name;
        this.type = type;
        this.winCase = winCase;
        this.loseCase = loseCase;
    }

    public ChoiceType getType() {
        return type;
    }

    public void setType(ChoiceType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int evaluate(Choice c) {
        if(c.getType() == winCase) {
            return WIN;
        } else if (c.getType() == loseCase) {
            return LOSE;
        } else {
            return TIE;
        }
    }
}
