package org.vashonsd.Utils;

//import org.junit.Assert;
//import org.junit.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by andy on 5/2/18.
 */
public class UtilsTests {
    @Test
    public void testIsInteger(){
        assertTrue(Utils.IsInteger("3"));
        assertFalse(Utils.IsInteger("th4n"));
    }

    @Test
    public void testWordIsInside() {
        assertTrue(Utils.wordIsInside("ladder", "deal"));
        assertFalse(Utils.wordIsInside("ladder", "dall"));
        assertFalse(Utils.wordIsInside("able", "bat"));
    }

    @Test
    public void testObviousThings() {
        assertTrue(2==2);
        assertFalse(2==3);
    }
}
