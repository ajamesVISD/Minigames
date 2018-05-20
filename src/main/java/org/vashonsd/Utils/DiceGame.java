package org.vashonsd.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andy on 5/3/18.
 */
public class DiceGame extends Minigame {
    List<Integer> playerDice;
    List<Integer> computerDice;
    private int numDice;
    int round;
    private int playerScore;
    private int computerScore;

    public DiceGame() {
        super("Dice Wars", "A battle of wits and luck", "quit");
        playerDice = new ArrayList<Integer>();
        computerDice = new ArrayList<Integer>();
    }

    @Override
    public String start() {
        setUp();
        return "Welcome to Dice Wars!" +
                "\nYour dice are: " + playerDice.toString()
                +"Which die would you like to use in the first round?";
    }

    private void setUp() {
        numDice = 3;
        playerScore = computerScore = 0;
        round = 0;
        for(int i=0; i<numDice; i++) {
            playerDice.add(Utils.rollDie(6));
            computerDice.add(Utils.rollDie(6));
        }
    }

    @Override
    public String handle(String str) {

        //Sanity checks;
        if(!Utils.IsInteger(str)) {
            return "Sorry, you must enter a number from 1 to " + playerDice.size();
        }
        int playerChoice = Integer.valueOf(str);
        if(!(playerChoice >=1 && playerChoice <= playerDice.size())) {
            return "You must choose a number from 1 to " + playerDice.size();
        }



        int compDie = computerDice.remove(Randomizer.nextInt(computerDice.size()));
        //if(playerDie > compDie) {

        //}
        return null;
    }

    @Override
    public String quit() {
        return "Thanks for playing!";
    }
}
