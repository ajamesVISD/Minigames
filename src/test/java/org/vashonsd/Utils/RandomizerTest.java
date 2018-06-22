package org.vashonsd.Utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class RandomizerTest {

    @Test
    public void testRandomWord() {
        try {
            System.out.println(Randomizer.randomWord());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void randomWord() {
    }

    @Test
    public void randomWord1() {
        boolean sentinel = true;
        for(int i = 0; i<100; i++) {
            try {
                String w = Randomizer.randomWord(5);
                if(w.length() < 5 ) {
                    sentinel = false;
                }
            } catch (IOException e) {
                sentinel = false;
                e.printStackTrace();
            }
        }
        Assert.assertTrue(sentinel);
    }
}