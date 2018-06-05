package org.vashonsd.Utils;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class LetterStoreTest {

    LetterStore letterStore;

    @Before
    public void setUp() throws Exception {
        letterStore = new LetterStore();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCreation() {
        System.out.println(letterStore);
    }

    @Test
    public void testSettingCharTrue() {
        letterStore.setTrue('n');
        Assert.assertTrue(letterStore.getStatus('n'));
    }

    @Test
    public void testSettingCharFalse() {
        letterStore.setFalse('b');
        Assert.assertFalse(letterStore.getStatus('b'));
    }

    @Test
    public void testGetTrueValues() {
        letterStore.setTrue('n');
        letterStore.setTrue('a');
        List<Character> trues = letterStore.getTrueValues();
        Assert.assertEquals(trues.size(), 2);
        Set<Character> truesSet = new HashSet<Character>(trues);
        Assert.assertTrue(truesSet.contains('n'));
        Assert.assertTrue(truesSet.contains('a'));
        System.out.println(trues);
    }
}