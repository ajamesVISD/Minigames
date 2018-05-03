package org.vashonsd.Games;

import org.vashonsd.Games.AO.AngelicaGame;
import org.vashonsd.Games.BR.BeckettGame;
import org.vashonsd.Games.EO.EmmeGame;
import org.vashonsd.Games.HA.HuthaifaGame;
import org.vashonsd.Games.NA.NabilGame;
import org.vashonsd.Games.NE.NoahGame;
import org.vashonsd.Games.RI.RobertGame;
import org.vashonsd.Games.SP.SamGame;
import org.vashonsd.Games.SR.SeanGame;
import org.vashonsd.Utils.Minigame;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by andy on 5/2/18.
 */
public class MinigameFactory {

    private Map<String, Minigame> games;

    public String listGames() {
        String result = "";
        String spacer = "";
        for(Minigame m : games.values()) {
            result += spacer + m.getName() + " - " + m.getDescription();
            spacer = "\n";
        }
        return result;
    }

    public Minigame getGame(String s) {
        return games.get(s);
    }

    public boolean hasGame(String s) {
        return games.containsKey(s);
    }

    public MinigameFactory() {
        games = new HashMap<String, Minigame>();
        addGame(new TwentyQuestions());
        addGame(new AngelicaGame());
        addGame(new BeckettGame());
        addGame(new EmmeGame());
        addGame(new HuthaifaGame());
        addGame(new NoahGame());
        addGame(new RobertGame());
        addGame(new SamGame());
        addGame(new SeanGame());
        addGame(new NabilGame());
    }

    public void addGame(Minigame m) {
        games.put(m.getName(), m);
    }
}
