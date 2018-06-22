package org.vashonsd.Games.BR;

import org.vashonsd.Utils.Minigame;
import org.vashonsd.Utils.Utils;


/**
 * Created by andy on 5/2/18.
 */
public class BeckettGame extends Minigame {

    Round currentRound;

    public BeckettGame() {
        super("Hangman", "Its like hangman but isn't", "quit");
        setUp();
    }

    public String start(){
        setUp();
        return "The first word is " + currentRound.getScreenedWord();
    }

    private void setUp(){
        currentRound = new Round();
    }

    public String handle(String str) {
        if(str.length() > 1) {
            return "please supply one letter only.";
        }
        if(Utils.IsInteger(str)){
            return "please give me a letter, not a number. This is Hangman stupid!";
        }

        char guess = str.charAt(0);
        if(currentRound.lettersGuessed.getStatus(guess)) {
            return "you already guessed that, guess another letter";
        } else {
            currentRound.handleGuess(guess);
            //The guess was correct!
            if (currentRound.isInWord(guess)) {
                if(currentRound.playerHasWon()){
//                    System.out.println(currentRound.getStatus());
                    setUp();
                    return "You guessed it all right! " +
                            "I have chosen a new word for you: "
                            + currentRound.getStatus();
                } else {
                    return "Yes, " + guess + " is in the word!\n" + currentRound.getStatus();
                }
                //The guess was incorrect!
            } else {
                currentRound.guesses--;
                if(currentRound.getGuesses()==0){
                    return "You ran out of guesses, type quit now!";
                } else {
                    return "try again... thats wrong!\nYou have " + currentRound.getGuesses() + " guesses left";
                }
            }
        }
    }

    public String quit(){
        return "You ended the game";
    }
}
