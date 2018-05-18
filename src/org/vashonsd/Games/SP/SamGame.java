package org.vashonsd.Games.SP;
import org.vashonsd.Utils.Minigame;
import org.vashonsd.Utils.Utils;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by andy on 5/2/18.
 */
    public class SamGame extends Minigame {

    Random rn = new Random();
    int answer = rn.nextInt(10) + 1;
    int current = answer;
    int userInt1 = rn.nextInt(21) + 1;
    int userInt = userInt1;

      public SamGame() {
        super("Sam", "The saddest game in the world", "quit");
    }

    @Override
    public String start() {
        return "Welcome to my game, your cards hold a value of " + current + " would you like to hit or stick";
    }

    public void setUp() {

    }
    @Override
    public String handle(String str) {
        if(str.equalsIgnoreCase("hit")) {
            int answer2 = rn.nextInt(10)+1;
            int newAnswer = current + answer2;
            current = newAnswer;
            if(current > 21) {
                return "You busted you idiot!";
            }
            return "You cards hold a value of " + current + " would you like to hit or stick";
        }
        if(str.equalsIgnoreCase("stick")) {
            if(userInt < current) {
                if(current > 21) {
                    return "You busted you idiot!";
                }
                return "You win, and finished with a value of " + current + " the computer had "+userInt;
            } else if(userInt > current){
                if(current > 21) {
                    return "You busted you idiot!";
                }
                return "You lose, and you finished with a value of " + current + " the computer had " + userInt;
            } else {
                return "You pushed";
            }
        }
        if(!Utils.IsInteger(str)) {
            return "try typing hit or stick";
        }

          if(userInt < current) {
            return "You win";
        } else if(userInt > current) {
            return "You lose";
        } else {
              return "PUSH";
          }
    }

    @Override
    public String quit() {
        return null;
    }
}
