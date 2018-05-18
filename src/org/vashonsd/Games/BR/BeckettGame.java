package org.vashonsd.Games.BR;

import org.vashonsd.Utils.Minigame;
import org.vashonsd.Utils.Utils;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by andy on 5/2/18.
 */
public class BeckettGame extends Minigame {
    //the letters the user guesses
    private String hangLetters;
    // Word that is being guessed letter by letter
    private String hangWord;
    // The amount of guesses someone has based on the hangWord's length
    private int guessesLeft;
    // A list full of the guesses letters
    private List<String>guessedLetters;
    // A list of the guessed letters that match the string
    private List<String>correctLetters;


    public BeckettGame() {
        super("Hangman", "A game where you save a life", "quit");
        guessedLetters = new ArrayList<String>();
        correctLetters = new ArrayList<String>();

    }
    public String start(){
        setUp();
        return "Thank you for choosing HANGMAN ... produced by Beckett \n...Guess a letter";
    }

    private void setUp(){
        hangWord = "word";
        guessesLeft = hangWord.length();
    }


    public String handle(String str){
        if(str.length() > 1 || str.length() < 1) {
            return "You lose, you didn't guess a single letter. Play again!";
        }
        if(Utils.IsInteger(str)){
            return "You gotta guess a letter, not a number. Play again!";
        }
        if(str.equalsIgnoreCase(hangLetters)){
                return "Right";
        }
        if(!str.equalsIgnoreCase(hangLetters)){
            guessedLetters.add(str);
                if(guessesLeft == 0){
                    return "You ran out of guesses, type " + quitWord + " now";
                }
            guessesLeft--;
            return "Wrong, guess again... you have " + guessesLeft + " left " + guessedLetters;
        }
        else{
            return "congrats";
        }
    }


    public String quit(){
        return "You ended the game";
    }
}
