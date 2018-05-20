package org.vashonsd.Games.RPS_games;

import org.vashonsd.Utils.Minigame;

import java.util.Random;

/**
 * Created by andy on 5/10/18.
 */
public class RockPaperPlus extends Minigame {
    Choice userChoice;
    Choice computerChoice;

    public RockPaperPlus() {
        super("RPS", "A basic rock, paper, scissors game.", "quit");
        setComputerChoice();
    }

    @Override
    public String start() {
        return "Welcome to Rock, Paper, Scissors! Type your choice.";
    }

    @Override
    public String handle(String str) {
        if(str.equalsIgnoreCase("rock")) {
            userChoice = new Rock();
        } else if (str.equalsIgnoreCase("paper")) {
            userChoice = new Paper();
        } else if (str.equalsIgnoreCase("scissors")) {
            userChoice = new Scissors();
        } else {
            return "You need to choose either rock, paper, or scissors.";
        }
        int result = userChoice.evaluate(computerChoice);
        String rep = "The computer chose " + computerChoice.getName() + ". ";
        switch (result) {
            case -1: rep += "You lose!";
                break;
            case 1: rep += "You win!";
                break;
            default: rep += "Tie!";
        }
        return rep;
    }

    private void setComputerChoice() {
        Random r = new Random();
        int choice = r.nextInt(2);
        switch (choice) {
            case 0: computerChoice = new Rock();
                break;
            case 1: computerChoice = new Paper();
                break;
            default: computerChoice = new Scissors();
        }
    }

    @Override
    public String quit() {
        return null;
    }
}
