package org.vashonsd.Games.HA;

import org.vashonsd.Utils.Minigame;
import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;

public class RockPaperScissors extends Minigame {
    String[] adf = new String[]{"Rock", "Paper", "Scissor"};
    Scanner in = new Scanner(System.in);
    String userChoice = in.next();
    Random rand = new Random();
    String computerChoice = adf[rand.nextInt(adf.length)];
    HashMap<String, Integer> rpslookup = new HashMap<String, Integer>();
    int[][] WinnerTable = new int[3][3];
    int numPlayed;
    int userScore;
    int computerScoer;


    public RockPaperScissors() {
        super("RPS", "A simple game of rock, paper, scissors", "quit");
        // Rock = 0, Paper = 1, Scissors = 2
        WinnerTable[0][0] = 0;  // 0 == nobody  wins
        WinnerTable[1][1] = 0;
        WinnerTable[2][2] = 0;
        WinnerTable[0][1] = 2;  // 2 == second player wins
        WinnerTable[1][0] = 1;  // 1 == first player wins
        WinnerTable[0][2] = 1;
        WinnerTable[1][2] = 2;
        WinnerTable[2][0] = 2;
        WinnerTable[2][1] = 1;

        rpslookup.put("ROCK", 0);
        rpslookup.put("PAPER", 1);
        rpslookup.put("SCISSORS", 2);
    }


    @Override
    public String start() {
        return "The game just starte\n Chooes: Rock, paper, or scissor?";
    }

    @Override
    public String handle(String userChoice) {
            numPlayed++;

            computerChoice = adf[rand.nextInt(adf.length)];

            int p1 = rpslookup.get(computerChoice.toUpperCase());
            int p2;
            if (rpslookup.containsKey(userChoice.toUpperCase())) {
                p2 = rpslookup.get(userChoice.toUpperCase());
            } else {
                return "I don't understand " + userChoice + "; I need Rock, Paper or Scissors";
            }

            int whowins = WinnerTable[p1][p2];
            if (whowins == 0) {
                return "It's a tie!";
            }
            return "Try again!";
        }

        return "";
    }
    @Override
    public String quit() {
        return "Good Bye.";
    }
}
