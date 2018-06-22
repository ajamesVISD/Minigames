package org.vashonsd.Games.BR;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoundTest {

    Round round;

    @Before
    public void setUp() throws Exception {
        round = new Round();
        round.handleGuess('a');
        round.handleGuess('z');
    }

    @Test
    public void handleGuess() throws Exception {

    }

    @Test
    public void testPlayerHasWon() throws Exception {
        System.out.println("Player has won: " + round.playerHasWon());
    }

    @Test
    public void isInWord() throws Exception {
    }

    @Test
    public void testGetStatus() throws Exception {
        System.out.println(round.getStatus());
    }

    @Test
    public void testGetScreenedWord() throws Exception {
        System.out.println(round.getScreenedWord());
    }
}