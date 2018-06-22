package org.vashonsd.Games.NA;

import org.vashonsd.Utils.Cards.Card;

public class Player {

    private String name;
    int money;
    Hand hand;

    public Player() {
        money = 500;
        hand = new Hand();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(int howMuch) {
        money = money + howMuch;
    }

    public void takeMoney(int howMuch) {
        money = money - howMuch;
    }

    public void takeCards(Card card1, Card card2) {
        hand.takeCards(card1, card2);
    }

    public String printHand() {
        return hand.toString();
    }
}
