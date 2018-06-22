package org.vashonsd.Utils.Cards;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    int capacity;
    int startingSize;

    List<Card> cards = new ArrayList<Card>();

    public Hand(int capacity, int startingSize) {
        this.capacity = capacity;
        this.startingSize = startingSize;
    }

    @Override
    public String toString() {
        return "" + cards;
    }

    public void takeCard(Card c) {
        cards.add(c);
    }

    public void resetHand() {
        cards.removeAll(cards);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getStartingSize() {
        return startingSize;
    }

    public int getHandValue() {

        int total = 0;
        for(Card card : cards) {
            total += card.getValue();
        }
        return total;
    }

    public void setStartingSize(int startingSize) {
        this.startingSize = startingSize;
    }

}
