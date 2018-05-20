package org.vashonsd.Games.SR;

import org.vashonsd.Utils.Minigame;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


/**
 * Created by andy on 5/2/18.
 */
public class SeanGame extends Minigame {
    String[] spaces;
    List<String> spacesCopy;
    boolean compWin;
    boolean userWin;
    String[] fThree;
    String[] sThree;
    String[] lThree;

    public SeanGame() {
        super("Sean","like tic tac toe but worse","quit");
        spaces=new String[9];
        fThree=new String[3];
        sThree=new String[3];
        lThree=new String[3];
    }

    @Override
    public String start() {
        setUp();
        return "each position on the tic tac board has a number from zero to eight; type the number you want to play"+
                "\n1|2|3"+
                "\n4|5|6"+
                "\n7|8|9";
    }
    public void setUp() {
        for (int i = 0; i < 9; i++) {
            spaces[i] = "0";
        }
        spacesCopy = Arrays.asList(spaces);
        setReturns();
    }

    public void setReturns(){
        for (int i = 0; i < 3; i++) {
            fThree[i] = spaces[i];
        }

        sThree[0] = spaces[3];
        sThree[1] = spaces[4];
        sThree[2] = spaces[5];
        lThree[0] = spaces[6];
        lThree[1] = spaces[7];
        lThree[2] = spaces[8];
    }

    public void userWin(){
        if(spaces[0].equals("x")){
            if(spaces[2].equals("x")&&spaces[1].equals("x")){
                userWin=true;
            }
            else if(spaces[3].equals("x")&&spaces[6].equals("x")){
                userWin=true;
            }
            else if(spaces[5].equals("x")&&spaces[8].equals("x")){
                userWin=true;
            }

        }
        else if(spaces[8].equals("x")){
            if(spaces[6].equals("x")&&spaces[7].equals("x")){
                userWin=true;
            }
            else if(spaces[2].equals("x")&&spaces[5].equals("x")){
                userWin=true;
            }

        }
        if(spaces[4].equals("x")){
            if(spaces[6].equals("x")&&spaces[2].equals("x")){
                userWin=true;
            }
        }
        else{
            userWin=false;
        }

    }

    public void compWin(){
        if(spaces[0].equals("o")){
            if(spaces[2].equals("o")&&spaces[1].equals("o")){
                compWin=true;
            }
            else if(spaces[3].equals("o")&&spaces[0].equals("o")){
                compWin=true;
            }
            else if(spaces[5].equals("o")&&spaces[8].equals("o")){
                compWin=true;
            }

        }
        else if(spaces[8].equals("o")){
            if(spaces[6].equals("o")&&spaces[7].equals("o")){
                compWin=true;
            }
            else if(spaces[2].equals("o")&&spaces[5].equals("o")){
                compWin=true;
            }

        }
        else if(spaces[4].equals("o")){
            if(spaces[6].equals("o")&&spaces[2].equals("o")){
                compWin=true;
            }
        }
        else{
            compWin=false;
        }

    }

    @Override
    public String handle(String str) {
        int place =10;
        try {
            place = Integer.parseInt(str);
        }
        catch(NumberFormatException nfe ){}


        if(place<9&&(!spaces[place].equals("x"))&&(!spaces[place].equals("o"))){
            spaces[place]="x";
        }
        else{
            return "You cannot play there";
        }
        compWin();
        userWin();
        compProcess();
        if(compWin==true) {

            return detWinner();
        }
        else if(userWin==true){
            return detWinner();
        }
        else if(catsGame()){
            return detWinner();
        }
        spacesCopy = Arrays.asList(spaces);
        setReturns();
        return  spacesCopy.toString();


    }

    public boolean catsGame(){
        if(spacesCopy.contains("0")){
            return false;
        }
        else{
            return true;
        }
    }

    public void compProcess(){
        Random rand = new Random();
        int comp = rand.nextInt(8) + 1;
        int i=0;
        if(spaces[comp]=="0") {
            spaces[comp] = "o";
            i++;
        }
        else if(catsGame()){
        }
        else {
            compProcess();
        }


    }

    public String detWinner(){
        if(userWin){
            return "you win";
        }
        else if(compWin){
            return "you loose";
        }
        else if(catsGame()){
            return "tie";
        }
        else {
            return "aight fam";
        }
    }
    @Override
    public String quit() {

        return "adios";

    }
}
