package org.vashonsd.Utils;

import org.junit.Assert;
import org.junit.Test;

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
    public void testRollDie() {
        Assert.assertTrue(true);
    }
}
