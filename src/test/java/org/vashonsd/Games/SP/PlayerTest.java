package org.vashonsd.Games.SP;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    Player player;

    @Before
    public void setUp() throws Exception {
        player = new Player();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetHandCapacity() throws Exception {
        Assert.assertEquals(player.getHandCapacity(), 5);
    }

    @Test
    public void testGetHandStartingSize() throws Exception {
        Assert.assertEquals(player.getHandStartingSize(), 2);
    }
}