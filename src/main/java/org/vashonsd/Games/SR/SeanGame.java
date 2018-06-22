package org.vashonsd.Games.SR;

import org.vashonsd.Utils.Minigame;
import org.vashonsd.Utils.Utils;


/**
 * Created by andy on 5/2/18.
 */
public class SeanGame extends Minigame {
    Board toeBoard;

    public SeanGame() {
        super("Sean", "like tic tac toe but worse", "quit");
    }

    @Override
    public String start() {
        setUp();
        return "each position on the tic tac board has an x and y coordinate from 0 to 2 where the upper left is 0; type them in the format x,y" +
                "\n0|1|2" +
                "\n1| | " +
                "\n2| | ";
    }

    //Sets array used for storing player and computer game moves to inital values
    public void setUp() {
        toeBoard = new Board();
    }


    //    //Handle method which interacts with the user in the game.
    //handle parses the users string into into x and y cordinates and sets the space to them
    @Override
    public String handle(String str) {
        int x;
        int y;
        //parse the input.
        try {
            if (str.length() == 3) {
                String b = str.substring(0, 1);
                String d = str.substring(2, 3);
                y = Integer.parseInt(b);
                x = Integer.parseInt(d);
                if (x < 3 && y < 3 && toeBoard.getSpace(x, y).getValue() == State.EMPTY) {
                    toeBoard.setSpace(x, y, State.X);
                } else {
                    return "you cannot play there";
                }
            } else {
                return "you cant play there";
            }
        } catch (NumberFormatException nfe) {
            return "your number is to formatted in x,y";
        }
        return detWinner();
    }

    //
//
//    //method that decides where the computer plays, uses a random number unless the computer can block a move or play to win
    public void compProcess() {
       toeBoard.setGroupings();
               int comp = Utils.newRand(2);
               int comp2 = Utils.newRand(2);
               if(!win()) {
                   if(!block()){
                       if(!makeTwo()) {
                           if (toeBoard.getSpace(comp, comp2).getValue() == State.EMPTY) {
                               toeBoard.setSpace(comp, comp2, State.O);
                           } else if (toeBoard.tie() || toeBoard.xWins() || toeBoard.yWins()) {
                               quit();
                           } else {
                               compProcess();
                           }
                       }
                   }
               }

    }
    // determines if the computer can make a move to win by looping through paths and playing if the computer has 2 o's in one path
    public boolean win(){
        toeBoard.setGroupings();
        for(int i=0;i<8;i++){
            if(toeBoard.paths[i].getNumY()==2){
                for(int x=0;x<3;x++){
                    if(toeBoard.paths[i].getSpaceAt(x).containsValue(State.EMPTY)){
                        int z= toeBoard.paths[i].getSpaceAt(x).getNumber();
                        toeBoard.setSpace(z,State.O);
                        return true;
                    }
                }
            }
            if(i==8){
                return false;
            }
        }
        return false;
    }

    //Makes a row of two for the computer
    public boolean makeTwo(){
        toeBoard.setGroupings();
        for(int i=0;i<8;i++){
            if(toeBoard.paths[i].getNumY()==1){
                for(int x=0;x<3;x++){
                    if(toeBoard.paths[i].getSpaceAt(x).containsValue(State.EMPTY)){
                        int z= toeBoard.paths[i].getSpaceAt(x).getNumber();
                        toeBoard.setSpace(z,State.O);
                        return true;
                    }
                }
            }
            if(i==8){
                return false;
            }
        }
        return false;
    }

    //determines if the computer can block a play to win by the user, by looping through paths to see if the opponent has two in a path
    public boolean block(){
        toeBoard.setGroupings();
        for(int i=0;i<8;i++){
            if(toeBoard.paths[i].getNumX()==2){
                for(int x=0;x<3;x++){
                    if(toeBoard.paths[i].getSpaceAt(x).containsValue(State.EMPTY)){
                        int z= toeBoard.paths[i].getSpaceAt(x).getNumber();
                        toeBoard.setSpace(z,State.O);
                        return true;
                    }
                }
            }
            if(i==8){
                return false;
            }
        }
        return false;
    }



    //determines who has won by checking
    //also runs the compProcess method if the game is still going and prints out the board.
    public String detWinner() {
        if(!toeBoard.tie()&&!toeBoard.xWins()&&!toeBoard.yWins()) {
            compProcess();
        }
        if (toeBoard.xWins()) {
            return "You win!";
        } else if (toeBoard.yWins()) {
            return "You lose";
        }else if(toeBoard.tie()){
            return "tie";
        }
        else {
            return toeBoard.toString();
        }
    }

    @Override
    public String quit() {

        return "adios";

    }


}

