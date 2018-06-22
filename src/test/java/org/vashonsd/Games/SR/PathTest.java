package org.vashonsd.Games.SR;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PathTest {
    Path winPath;
    Path losePath;
    private Path oWinPath;

    @Before
    public void setUp() throws Exception {
        winPath = new Path(
                new Space(State.X, 3),
                new Space(State.X, 3),
                new Space(State.X, 3)
        );
        losePath = new Path(
                new Space(State.X, 2),
                new Space(State.X, 2),
                new Space(State.O, 2)
        );
        oWinPath = new Path(
                new Space(State.O, 1),
                new Space(State.O, 1),
                new Space(State.O, 1)
        );
    }

    @Test
    public void getSpaceAt() throws Exception {
    }

    @Test
    public void xWin() throws Exception {
//        System.out.println(winPath);
        Assert.assertTrue(winPath.xWin());
        Assert.assertFalse(losePath.xWin());
    }

    @Test
    public void testOWin() throws Exception {
        Assert.assertTrue(oWinPath.oWin());
    }

}