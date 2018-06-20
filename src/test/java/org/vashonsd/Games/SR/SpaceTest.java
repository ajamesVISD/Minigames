package org.vashonsd.Games.SR;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpaceTest {

    Space space;

    @Before
    public void setUp() throws Exception {
        space = new Space(State.X, 1);
    }

    @Test
    public void containsValue() throws Exception {
        Assert.assertTrue(space.containsValue(State.X));
    }

    @Test
    public void setNumber() throws Exception {
    }

    @Test
    public void testToString() throws Exception {
        System.out.println(space);
    }

    @Test
    public void testIsX() throws Exception {
        Assert.assertTrue(space.isX());
    }
}