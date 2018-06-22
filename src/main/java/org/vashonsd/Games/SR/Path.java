package org.vashonsd.Games.SR;

public class Path {
    Space one;
    Space two;
    Space three;
    Space[] row;
    int numX;
    int numY;
    int[] spaceOne;
    int[] spaceTwo;
    int[] spaceThree;

    //Every path contains three spaces that when identical represent a win these spaces are set into an array
    //they also have a number of x and o contained inside for checking for wins
    public Path(Space one, Space two, Space three) {
        this.one=one;
        this.two=two;
        this.three=three;
        row = new Space[3];
        row[0]=one;
        row[1]=two;
        row[2]=three;
        numX=0;
        numY=0;
        setNumXY();
    }

    public Space getSpaceAt(int x){
        return row[x];
    }

    //checks to see if they player has won a row
    public Boolean xWin(){
        return (one.isX() && two.isX() && three.isX());
    }

    //Checks to see if the computer has won
    public boolean oWin(){
        return (one.isO() && two.isO() && three.isO());
    }

    public int getNumX(){
        return numX;
    }

    public int getNumY(){
        return numY;
    }

    //sets the number of xs and os in the path by looping through the path and adding one for each instance of x or o to their respective counters
    public void setNumXY(){
        for(int i=0;i<3;i++){
            if(row[i].getValue()==State.X){
                numX++;
            }
            else if(row[i].getValue()==State.O){
                numY++;
            }
        }
    }

    @Override
    public String toString() {
        return "Path{" +
                "one=" + one +
                ", two=" + two +
                ", three=" + three +
                '}';
    }
}
