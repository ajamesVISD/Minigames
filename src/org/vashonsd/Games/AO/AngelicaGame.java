package org.vashonsd.Games.AO;

import org.vashonsd.Utils.Minigame;
import org.vashonsd.Utils.Placeholder;

import java.util.Objects;

/**
 * Created by andy on 5/2/18.
 */
public class AngelicaGame extends Minigame {

    private String lastWordSaid;
    private String newWord;
    private String firstWord;

    public AngelicaGame() { super("Angelica", "Angelica's game that takes a word and make the user create more words out of that word.", "quit");
        lastWordSaid = "";
        newWord = "";
    }

    @Override
    public String start() {
        return "Welcome to my game. Let's play. Give me a word that is 5 or more letters.";
    }


    @Override
    public String handle(String str) {
        if (lastWordSaid == "") {
            lastWordSaid = str;
            if(lastWordSaid.length() >= 5){
                return"Okay, what other words can you make out of your word?";
            }
            else {
                if(lastWordSaid.length() < 5){
                    return"Your word needs to be longer";

                }
            }

        }

    return "Well done!";
    }





    @Override
    public String quit() {
        return "Okay, bye.";
    }
}
