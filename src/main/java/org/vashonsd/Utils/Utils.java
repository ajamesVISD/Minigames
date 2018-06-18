package org.vashonsd.Utils;


import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Utils {

    static final String pathPrefix = "src/main/resources/";

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

    /**
     * Returns a (pseudo)random die roll from 1 to the maximum number provided.
     * @param max
     * @return
     */
    public static int rollDie(int max) {
        Random rand = new Random();
        return rand.nextInt(max)+1;
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

    /**
     * This method will return all the lines from the given file as an array of strings.
     *
     * It is up to the user what to do with that array.
     *
     * @param filename The name of the file. Please make it unique.
     * @return All the lines of the file, in the form of an array of Strings.
     */
    public static List<String> readFromFile(String filename) throws IOException {

        List<String> lines;
        Path path = Paths.get(pathPrefix + filename);
        lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        return lines;
    }

    public static void writeToFile(List<String> strings, String filename) throws IOException {
        Path path = Paths.get(pathPrefix + filename);
        Files.write(path, strings, StandardCharsets.UTF_8);
    }

    public static void appendToFile(List<String> strings, String filename) throws IOException {
        Path path = Paths.get(pathPrefix + filename);
        List<String> previousLines = readFromFile(filename);
        previousLines.addAll(strings);
        writeToFile(previousLines, filename);
    }

//_______________________________________________________________________________________________________

// Loops through the string and checks if the letter exists in the string
    public static boolean letterIsInWord(String goalWord,
                                      String guessedLetter) {
        char c = guessedLetter.charAt(0);
        for (int i = 0; i < goalWord.length(); i++) {
            if(c == goalWord.charAt(i)) {
                return true;
            }
        }
        return false;
    }
//shows all the indexes of a word where a letter exists
    public static int[] allIndexesOf(String word, char search){
        ArrayList<Integer> indexesOfString = new ArrayList<Integer>();
        for(int i = 0; i<word.length(); i++) {
            if (word.charAt(i) == search) {
                indexesOfString.add(i);
            }
        }
        //Convert ArrayList to array
//        System.out.println(indexesOfString);
        int[] result = new int[indexesOfString.size()];
        for (int i=0; i<indexesOfString.size(); i++) {
            result[i] = indexesOfString.get(i);
        }
//        String test = Arrays.toString(result);
//        return test;
        return result;
    }
}
