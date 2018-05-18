package org.vashonsd.Games.RI;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.vashonsd.Utils.Minigame;


import java.util.Random;

/**
 * Created by andy on 5/2/18.
 */
public class RobertGame extends Minigame {
    private int length = 6;
    private int width = 5;
    private String[][] grid = new String[length][width];
    private String gridText;
    public RobertGame(){super("Minesweeper", "A game where you have to avoid all of the mines", "quit"); }

    public String start(){
        for(int i = 0; i < length - 1; i++) {
            for (int j = 0; j < width - 1; j++) {
                Random random = new Random();
             int num = random.nextInt(3) + 1;
                if (num == 1) {
                    grid[j][i] = "1";
             } else {
                    grid[j][i] = "2";
                }
            }
        }
        for(int x = 0; x < length - 1; x++) {
            for(int y = 0; y < width; y++) {
                gridText = gridText + grid[x][y] + " ";
            }
            gridText = gridText + "\n";
        }
        return gridText;
    }

    public String getQuitWord(){return quitWord;}

    public String getDescription(){return description;}

    @Override
    public String handle(String str) {

    return str;
    }

    @Override
    public String quit() {
        return "Thanks for playing!";
    }



}
