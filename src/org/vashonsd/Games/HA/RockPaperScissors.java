package org.vashonsd.Games.HA;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.vashonsd.Utils.Minigame;
import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors extends Minigame {
    String[] adf = new String[] {"Rock","Paper","Scissor"};
    Scanner in= new Scanner(System.in);
    String userChoice  = in.next();
    Random rand = new Random();
    String computerChoice = adf[rand.nextInt(adf.length)];
    public RockPaperScissors() {
        super("RPS", "A simple game of rock, paper, scissors", "quit");
    }



    @Override
    public String start() {
        return "The game just starte\n Chooes: Rock, paper, or scissor?";
    }

    @Override
    public String handle(String userChoice) {

        if(userChoice.equalsIgnoreCase("rock")) {
            return "you win!"+" "+ userChoice+" "+computerChoice;
        } else {
            return "you lose!"+"  "+userChoice+" "+computerChoice;
        }
    }

    @Override
    public String quit() {
        return "Good Bye.";
    }
}
