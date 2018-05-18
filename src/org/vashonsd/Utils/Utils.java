package org.vashonsd.Utils;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Utils {

    /**
     * Returns true if the given String is an integer, false otherwise.
     *
     * Note that this method still returns true if the String is negative or zero.
     */
    public static boolean IsInteger(String s) {
        if(s.isEmpty()) return false;
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) == '-') {
                if(s.length() == 1) return false;
                else continue;
            }
            if( !Character.isDigit(s.charAt(i)) ) return false;
        }
        return true;
    }

    public static int rollDie() {
        Random rand = new Random();
        return rand.nextInt(5)+1;
    }

//    public static ArrayList isInGoalWord(char letter, String goalWord, String correctGuesses){
//
//        for(int i = 0; i < goalWord.length(); i++){
//            if(goalWord.substring(i).equalsIgnoreCase("" + letter)){
//                correctGuesses.replace(correctGuesses.substring(i, i + 1), letter);
//
//            }
//
//        }
//
//
//    }
}
