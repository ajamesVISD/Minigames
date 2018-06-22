package org.vashonsd.Utils;

import org.junit.Before;
import org.junit.Test;
import org.vashonsd.Games.BR.Round;

public class RoundTest {

    Round round;

    @Before
    public void setUp() {
        round = new Round();
    }

    @Test
    public void printScreenedWord() throws Exception {
        System.out.println(round.getScreenedWord());
    }

}