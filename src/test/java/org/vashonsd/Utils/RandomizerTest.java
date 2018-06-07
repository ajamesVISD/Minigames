package org.vashonsd.Utils;

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
}