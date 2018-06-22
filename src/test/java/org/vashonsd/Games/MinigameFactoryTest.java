package org.vashonsd.Games;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinigameFactoryTest {

    public MinigameFactoryTest() {
    }

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getGame() {
        System.out.println(MinigameFactory.listGames());
        System.out.println(MinigameFactory.getGame("20q"));
        System.out.println(MinigameFactory.getGame("Noah"));
    }
}