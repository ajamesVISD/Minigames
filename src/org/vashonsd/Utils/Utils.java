package org.vashonsd.Utils;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utils {

    /**
     * Returns true if the given String is an integer, false otherwise.
     * <p>
     * Note that this method still returns true if the String is negative or zero.
     */
    public static boolean IsInteger(String s) {
        if (s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-') {
                if (s.length() == 1) return false;
                else continue;
            }
            if (!Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }

    /**
     * Returns true if we can find the String sub inside the String str.
     * <p>
     * Example: wordIsInside("ladder", "deal") -> true
     * wordIsInside("hallway", "witch") -> false
     */
    public static boolean wordIsInside(String str, String sub) {

        if (sub.length() > str.length() || sub.isEmpty()) {
            return false;
        }

         else {

            //Take all the characters in the "outer" word and put them in an ArrayList.
            ArrayList<Character> outer = new ArrayList<Character>();
            for(Character c: str.toCharArray()) {
                outer.add(c);
            }

            //Do the same with the Characters in the inner word.
            ArrayList<Character> inner = new ArrayList<Character>();
            for(Character c: sub.toCharArray()) {
                inner.add(c);
            }


            for (Character c : inner) {
                if(!outer.remove(c)) {
                    return false;
                }
            }
        }
        return true;
}
}
