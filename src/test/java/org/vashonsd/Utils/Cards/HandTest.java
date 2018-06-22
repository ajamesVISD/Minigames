package org.vashonsd.Utils.Cards;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HandTest {

    Deck deck;
    Hand hand;

    @Before
    public void setUp() throws Exception {
        deck = new Deck();
        hand = new Hand(5,5);
        deck.shuffle();
    }

    @Test
    public void getHandValue() throws Exception {
        hand.takeCard(new Card(6, 2));
        hand.takeCard(new Card(5, 1));
        Assert.assertEquals(hand.getHandValue(), 11);
    }

    @Test
    public void testDeal() throws Exception {
    }

    @Test
    public void testToString() throws Exception {
        deck = new Deck();
        deck.shuffle();
        hand = new Hand(5, 5);
        System.out.println(hand);
    }

}