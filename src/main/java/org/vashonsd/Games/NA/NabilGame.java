package org.vashonsd.Games.NA;

import org.vashonsd.Utils.Cards.Card;
import org.vashonsd.Utils.Cards.Deck;
import org.vashonsd.Utils.Minigame;
import org.vashonsd.Utils.Utils;

import java.util.Set;

/**
 * Created by andy on 5/2/18.
 */
public class NabilGame extends Minigame {

    private Player user;
    private Deck gamedeck;
    private Card card1;
    private Card card2;

    public NabilGame() {
       super("Win", "A game in which you always win.", "quit");
        user = new Player();
    }


    @Override
    public String start() {
        setUpGame();
        return "Your hand is: " + user.printHand() + "\n" +
                "Congratulations! You already have  " + user.getMoney() + " How much would you like to bet?";
    }

    @Override
    public String handle(String str) {
        if (!Utils.IsInteger(str)) {
            return "You must type a number.";
        }
        int bet = Integer.parseInt(str);
        Card newCard = gamedeck.deal();

        int newCardValue = newCard.getValue();

//        System.out.println(user.printHand());
        String result = "The card was " + newCard.toString() + ". ";
        if (newCardValue < card1.getValue() || newCardValue > card2.getValue()) {
            //Take money away from the user.
            user.takeMoney(bet);
            result += "Oh no, you lose!";
        } else if (newCardValue == card1.getValue() || newCardValue == card2.getValue()) {
            result += "Tie!";
        } else {
            user.addMoney(bet);
            result += "Yeasss , you win!";
        }
        //Set up a new hand for the user.
        setUpGame();

        result += "\nYour new hand is: " + user.printHand();
        result += "\nYou have " + user.getMoney() + " left. How much would you like to bet?";
        return result;
    }

    private void setUpGame() {
        gamedeck = new Deck();
        gamedeck.shuffle();
        card1 = gamedeck.deal();
        card2 = gamedeck.deal();
        if (card1.getRank() > card2.getRank()) {
            Card tmp = card1;
            card1 = card2;
            card2 = tmp;
        }
        user.takeCards(card1, card2);
    }


    @Override
    public String quit() {
        return " Goodbye! Thanks for playing!";
    }
}

