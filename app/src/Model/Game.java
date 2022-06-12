package Model;

import java.util.ArrayList;

public class Game {
    private ArrayList<Line> roundGame;

    public Game(ArrayList<Line> lines){
        this.roundGame = new ArrayList<Line>();
        this.roundGame.addAll(lines);
    }

    public ArrayList<Line> getRoundGame() {
        return roundGame;
    }

}
