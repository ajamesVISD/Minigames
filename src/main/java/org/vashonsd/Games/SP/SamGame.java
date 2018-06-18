package org.vashonsd.Games.SP;
import org.vashonsd.Utils.Cards.Card;
import org.vashonsd.Utils.Cards.Deck;
import org.vashonsd.Utils.Cards.Hand;
import org.vashonsd.Utils.Minigame;
import org.vashonsd.Utils.Utils;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by andy on 5/2/18.
 */
public class SamGame extends Minigame {

    private Player human;
    private Player computer;

    private Deck deck;

    private int currentBet;
    private boolean betSet;

    public SamGame() {
        super("Blackjack", "A betting game, kind of, it sucks", "quit");
        human = new Player();
        computer = new Player();
        deck = new Deck();
        deck.shuffle();
        for (int i = 0; i < human.getHandStartingSize(); i++) {
            human.takeCard(deck.deal());
        }
        for (int i = 0; i < computer.getHandStartingSize(); i++) {
            computer.takeCard(deck.deal());
        }
        Scanner sc = new Scanner(System.in);
    }

    @Override
    public String start() {
        betSet = false;
        return " Welcome to the game. You have " + human.getCash() +"$" + "\n Your hand is: " + human.getHand() + " Your hand has a value of " + human.getHand().getHandValue() + "\n How much would you like to bet?";
    }

    @Override
    public String quit() {
        deck = new Deck();
        deck.shuffle();
        human.getHand().resetHand();
        computer.getHand().resetHand();
        for (int i = 0; i < human.getHandStartingSize(); i++) {
            human.takeCard(deck.deal());
        }
        for (int i = 0; i < computer.getHandStartingSize(); i++) {
            computer.takeCard(deck.deal());
        }
        return "See ya later";
    }

    @Override
    public String handle(String str) {
        if(!betSet) {
            if(Utils.IsInteger(str)) {
                currentBet = Integer.parseInt(str);
                betSet = true;
                Hand userHandStart = human.getHand();
                return "You bet "  + currentBet + "\nYour starting hand is " + human.getHand().toString() + " Your hand had a value of " + userHandStart.getHandValue();
            } else {
                return "your bet must be a number.";
            }
        } else {
            if(str.equalsIgnoreCase("yes")) {
                deck.shuffle();
            } else if(str.equalsIgnoreCase("no")) {
                return null;
            }
            if(str.equalsIgnoreCase("hit")) {
                Hand userHand = human.getHand();
                userHand.takeCard(deck.deal());
                if(userHand.getHandValue() > 21) {
                    int i = currentBet;
                    int cash = human.getCash() - currentBet;
                    return "You busted my man and lost, you now have " + cash + "$";
                }
                return "Your hand is " + userHand.toString() + ", total of " + userHand.getHandValue();
            } else if(str.equalsIgnoreCase("stand")){

                if(human.getHand().getHandValue() > 21) {
                    int i = currentBet;
                    int cash = human.getCash() - currentBet;
                    return "You busted my man and lost, you now have " + cash + "$";
                }
                while(computer.getHand().getHandValue() <= 17) {
                    computer.getHand().takeCard(deck.deal());
                }
                if(computer.getHand().getHandValue() > 21) {
                    int cash = currentBet + human.getCash();
                    return "You win, the computer busted, you now have " + cash + "$";
                }
                if(human.getHand().getHandValue() > computer.getHand().getHandValue()) {
                    int cash = currentBet + human.getCash();
                    return "You win, your final hand was " + human.getHand() + "\nThe computer had " + computer.getHand() + "\nYour total hand value: " + human.getHand().getHandValue() + "\ncomputer total hand value: " + computer.getHand().getHandValue() + "\nYou now have " + cash + "$";
                } else if(human.getHand().getHandValue() < computer.getHand().getHandValue()) {
                    int cash = human.getCash() - currentBet;
                    return "You lose, your final hand was " + human.getHand() + "\nThe computer had " + computer.getHand() + "\nYour total hand value: " + human.getHand().getHandValue() + "\ncomputer total hand value: " + computer.getHand().getHandValue() + "\nYou now have " + cash + "$";
                } else {
                    return "PUSH";
                }
            } else {
                return "Try typing hit or stand";
            }
        }
    }
}
