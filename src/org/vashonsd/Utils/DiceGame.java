package org.vashonsd.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andy on 5/3/18.
 */
public class DiceGame extends Minigame {
    List<Integer> playerDice;
    List<Integer> computerDice;
    int round = 1;

    public DiceGame() {
        super("Dice Wars", "A battle of wits and luck", "quit");
        playerDice = new ArrayList<Integer>();
        computerDice = new ArrayList<Integer>();
    }

    @Override
    public String start() {
        setUp();
        return "Welcome to Dice Wars!";
    }

    private void setUp() {
        for(int i=0; i<3; i++) {
            playerDice.add(Utils.rollDie());
            computerDice.add(Utils.rollDie());
        }
    }

    @Override
    public String handle(String str) {
        if(round == 1) {
            return "Your dice are " + playerDice.toString();
        }
        return null;
    }

    @Override
    public String quit() {
        return "Thanks for playing!";
    }
}
