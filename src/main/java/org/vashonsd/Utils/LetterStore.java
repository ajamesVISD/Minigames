package org.vashonsd.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class can be used to record what letters have been guessed, or eliminated, or anything else.
 */
public class LetterStore {

    Map<Character, Boolean> store;

    public LetterStore() {
        store = new HashMap<Character, Boolean>();
        for(int i = 97; i < 123; i++) {
            store.put((char)i, false);
        }
    }

    public void setTrue(char c) {
        store.put(c, true);
    }

    public void setFalse(char c) {
        store.put(c, false);
    }

    public boolean getStatus(char c) {
        return store.get(c);
    }
    /**
     * Returns a List of all the characters that are marked true.
     * @return A List of Characters.
     */
    public List<Character> getTrueValues() {
        List<Character> result = new ArrayList<Character>();
        for(Map.Entry<Character,Boolean> entry : store.entrySet()) {
            if(entry.getValue()) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public int getSize(){
        return store.size();
    }
    @Override
    public String toString() {
        return "LetterStore{" +
                "store=" + store +
                '}';
    }
}
