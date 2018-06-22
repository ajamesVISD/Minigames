package org.vashonsd.Games.NA;

import org.vashonsd.Utils.Cards.Card;




public class Hand {

    Card lowCard;
    Card highCard;

    public Hand() {


    }

    /**
     * Takes two cards and assigns one to be the lowCard and one to be the highCard.
     *
     * Hint: We can get the number of the card by calling card.getRank();
     *
     * @param card1
     * @param card2
     */

    public void takeCards(Card card1, Card card2) {

        if( card1.getCardNumber() < card2.getCardNumber() ) {
            lowCard = card1;
            highCard = card2;
        } else {
            lowCard = card2;
            highCard = card1;
        }
        int lc = lowCard.getCardNumber();
        int hc = highCard.getCardNumber();

        if (lc == hc) {
            // draw one more card
        } else if (lc+1 == hc) {
            // draw one more card.
        }
    }

    @Override
    public String toString() {
        return "lowCard = " + lowCard + ", highCard = " + highCard;
    }
}
