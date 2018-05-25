package org.vashonsd.Games.HA;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.vashonsd.Utils.Minigame;
import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors extends Minigame {
    String[] random = new String[] {"R","P","S"};
    Scanner in= new Scanner(System.in);
    String userChoice  = in.next();
    int computerChoice = new Random().nextInt(random.length);
    public RockPaperScissors() {
        super("RPS", "A simple game of rock, paper, scissors", "quit");
    }



    @Override
    public String start() {
        return "The game just starte\n Chooes: Rock, paper, or scissor?";
    }

    @Override
    public String handle(String str) {

        if(userChoice.equalsIgnoreCase("rock")) {
            return "you win!";
        } else {
            return "you lose!";
        }
    }

    @Override
    public String quit() {
        return "Good Bye.";
    }
}
