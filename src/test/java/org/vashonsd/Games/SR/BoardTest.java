package org.vashonsd.Games.SR;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {
    Board testBoard;

    @Before
    public void setUp() throws Exception {

        testBoard = new Board();
    }

    @After
    public void tearDown() throws Exception {
    }


        @Test
        public void testXWin() throws Exception{
            testBoard.setSpace(0,0,State.O);
            testBoard.setSpace(1,1,State.O);
            testBoard.setSpace(2,2,State.O);
            System.out.println("yeah dude : "+testBoard.yWins());
        }


}