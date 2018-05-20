package org.vashonsd.Utils;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

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
}
