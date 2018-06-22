package org.vashonsd.Utils;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Created by andy on 5/20/18.
 */
public class UtilsTest {
//    @Test
//    public void testLetterIsInWord() throws Exception {
//        Assert.assertTrue(Utils.letterIsInWord("eaten","e"));
//        Assert.assertFalse(Utils.letterIsInWord("eaten", "j"));
//    }

//    @Test
//    public void testAddToArrayList() {
//        ArrayList<String> word = new ArrayList <String>();
//        Assert.assertArrayEquals("{0,4}" == Utils.addToArrayList(new int[] {0,4}, word, "h");
//
//    }

//    @Before
//    public void setUp() throws Exception {
//        Map rollFrequencies = new HashMap<Integer, Integer>();
//        int dieMax = 12;
//        for(int i=0; i<1000; i++) {
//            int roll = Utils.rollDie(dieMax);
//            int val = rollFrequencies.containsKey(roll) ? rollFrequencies.get(roll) : 0;
//            rollFrequencies.put(roll, val+1);
//        }
//        List<String> testLines = new ArrayList<String>();
//        testLines.addAll(Arrays.asList(new String[] {"one", "two", "three"}));
//    }
//
//    @After
//    public void tearDown() throws Exception {
//
//    }

    @Test
    public void testAppendToFile() throws Exception {

    }

    @Test
    public void testIsInteger() throws Exception {
        Assert.assertTrue(Utils.IsInteger("3"));
        Assert.assertFalse(Utils.IsInteger("th4"));
    }


//    @Test
//    public void testAllIndexesOfLetter() throws Exception {
//        String outer = "banana";
//        char inner = 'a';
//        Assert.assertArrayEquals(new int[]{1,3,5}, Utils.allIndexesOf("banana", 'a'));
//    }

//    @Test
//    public void testRollDie() throws Exception {
//        System.out.println(rollFrequencies);
//    }
//
//    @Test
//    public void testRollDieProducesOnlyLegalNumbers() throws Exception {
//
//        //First we will check if any values outside the Set were rolled
//        Set<Integer> legalValues = new HashSet<Integer>();
//        for(int i=1; i<dieMax + 1; i++) {
//            legalValues.add(i);
//        }
//        boolean illegalNumber = false;
//        for(Integer r : rollFrequencies.keySet()) {
//            if(!legalValues.contains(r)) {
//                illegalNumber = true;
//            }
//        }
//        Assert.assertFalse(illegalNumber);
//    }
//
//    /**
//     * Technically this is not a valid test, because even under normal probability there is a vanishingly small chance
//     * we could roll a die 1,000 times and one number would be missing. Not likely enough to worry, though.
//     *
//     * @throws Exception
//     */
//    @Test
//    public void testRollDieProducesEveryNumber() throws Exception {
//        boolean numberNotPresent = false;
//        for(int i=1; i<dieMax + 1; i++) {
//            if(!rollFrequencies.containsKey(i)) {
//                numberNotPresent = true;
//            }
//        }
//        Assert.assertFalse(numberNotPresent);
//    }
//
//    @Test
//    public void testReadFromFile() throws Exception {
//        System.out.println(Utils.readFromFile("demo.txt"));
//    }
//
//    @Test
//    public void testWriteToFile() throws Exception {
//        Utils.writeToFile(testLines, "demo.txt");
//    }
//
//    @Test
//    public void testWordIsInside() throws Exception {
//        Assert.assertTrue(Utils.wordIsInside("ability", "tail"));
//        Assert.assertFalse(Utils.wordIsInside("least","table"));
//    }
//
//

}