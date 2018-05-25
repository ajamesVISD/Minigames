package org.vashonsd;

import org.vashonsd.Utils.Minigame;
import org.vashonsd.Games.MinigameFactory;

import java.util.Scanner;

public class Main {


    private static final String quitWord = "quit";
    private static Minigame currentGame;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userIn = "";
        while(userIn != quitWord) {
            if (currentGame == null) {
                System.out.println(MinigameFactory.listGames());
                System.out.println("Type the name of the game you would like to play: ");
                userIn = in.nextLine();
                if(userIn.equalsIgnoreCase(quitWord)) break;
                if(!MinigameFactory.hasGame(userIn)) {
                    System.out.println("Try again.");
                } else {
                    currentGame = MinigameFactory.getGame(userIn);
                    System.out.println(currentGame.start());
                    userIn = in.nextLine();
                }
            } else if(userIn.equalsIgnoreCase(currentGame.getQuitWord())) {
                System.out.println(currentGame.quit());
                currentGame = null;
            } else {
                System.out.println(currentGame.handle(userIn));
                userIn = in.nextLine();
            }
        }
        System.out.println("Goodbye!");
        in.close();
    }
}
