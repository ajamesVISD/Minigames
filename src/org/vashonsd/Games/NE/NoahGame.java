package org.vashonsd.Games.NE;
import java.util.Random;
import org.vashonsd.Utils.Minigame;


/**
 * Created by andy on 5/2/18.
 */

    public class NoahGame extends Minigame {
    int win = 0;
    int loss = 0;
    int tie = 0;
    Choice userChoice;
    Choice computerChoice;


    public NoahGame() {
        super("Noah", "A super boring game", "Quit");
    }

    @Override
    public String start() {
        //setUp();
        return ("Welcome to the game! It's Rock, Paper, Scissors\nIf you don't know how to play, type \"rules\" in the input field." +
                "\nType Rock, Paper or Scissors to begin!");
    }

    /**
     * Call this method to get the game into its initial state.
     */
    private void setUp() {

    }


    @Override
    public String handle(String str) {

        String score = "You have " + win + " wins \nYou have " + loss + " losses \nYou have " + tie + " ties";

        if (str.equalsIgnoreCase("rules")) {
            return "Paper covers Rock\nRock smashes Scissors\nAnd Scissors cuts Paper\nType 'score' to get the score of the game";
        } else if (str.equalsIgnoreCase("score")) {
            return score + "\n---------------\nType to play again:\n";
        }
        Random rand = new Random();
        int pick = rand.nextInt(2);
        if (pick == 0) {
            computerChoice = new Rock();
        } else if (pick == 1) {
            computerChoice = new Paper();
        } else {
            computerChoice = new Scissors();

        }


        //The game has just started, so we need to collect the user's choice.
        if (str.equalsIgnoreCase("rock")) {
            spin();
            userChoice = new Rock();
        } else if (str.equalsIgnoreCase("paper")) {
            spin();
            userChoice = new Paper();
        } else if (str.equalsIgnoreCase("scissors")) {
            spin();
            userChoice = new Scissors();
        }else{
            return "I don't recognize "+ str +"\n---------------\nType to play again:\n";
        }


        //If the use types something illegal, reject it.

        //Otherwise, set userChoice to the correct Choice.

        //Then use a randomizer to set the computerChoice.


        String winner = userChoice.determineWinner(computerChoice);
        System.out.println("\nYou picked: " + userChoice.getName() + ", The computer picked: " + computerChoice.getName() +
                "\n\n" + winner);
        if (winner.contains("Win")) {
            win++;
        }
        if (winner.contains("Lose")) {
            loss++;
        }
        if (winner.contains("Tie")) {
            tie++;
        }
        return "---------------\nType to play again:\n";
    }



        @Override
        public String quit () {
            return "I bet you're happy you're leaving";
        }

        private void spin() {
            System.out.println("Rock...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Paper...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Scissors...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Shoot!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }





