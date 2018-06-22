package org.vashonsd.Games.SR;
import java.util.HashMap;
public class Space {

    private State value;
    public int number;

    public int getNumber() {
        return number;
    }

    public boolean containsValue(State state){
        if(value==state){
            return true;
        }
        else{
            return false;
        }
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Space(State value, int number){
        this.value=value;
        this.number=number;
    }

    public State getValue() {
        return value;
    }

    public boolean isX() {
        return this.value == State.X;
    }

    public boolean isO() {
        return this.value == State.O;
    }

    //switch to check what the value of a space is and print it
    public String toString(){
        String str = "";
        switch(value) {
            case O:
                str = "O";
                break;
            case X:
                str = "X";
                break;
            case EMPTY:
                str = " ";
                break;
        }
        return str;
    }

    public void setValue(State input){
        this.value=input;
    }
}
