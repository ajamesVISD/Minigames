package org.vashonsd.Utils;

import org.junit.Assert;
import org.junit.Test;
import org.vashonsd.Games.NE.Choice;
import org.vashonsd.Games.NE.Paper;
import org.vashonsd.Games.NE.Rock;
import org.vashonsd.Games.NE.Scissors;


/**
 * Created by andy on 5/2/18.
 */
public class UtilsTests {
    @Test
    public void testIsInteger(){
       Assert.assertTrue(Utils.IsInteger("3"));
        Assert.assertFalse(Utils.IsInteger("th4n"));
    }

    @Test
    public void testCardComparison() {
        Choice c = new Rock();
        Assert.assertEquals(c.determineWinner(new Paper()), "lose");
        Assert.assertEquals(c.determineWinner(new Scissors()), "win");
        Assert.assertEquals(c.determineWinner(new Rock()), "tie");

    }
}
