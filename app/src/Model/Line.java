package Model;

import java.util.ArrayList;

public class Line {

    public ArrayList<Piece> round ;

    public Line(Piece p1, Piece p2, Piece p3, Piece p4){
        this.round = new ArrayList<>();
        this.round.add(p1);
        this.round.add(p2);
        this.round.add(p3);
        this.round.add(p4);
    }

    // GETTER AND SETTER
    public ArrayList<Piece> getRound() {
        return round;
    }

    // TO STRING

    public String toStringRound(){
        String res = "";
        for (int i = 0; i<this.round.size();i++){
            res = res + "Place in the line of the piece :" + (i + 1) + " color : "+ round.get(i).getColor() + " position : " + this.round.get(i).getPosition() + "\n";
        }
        return res;
    }
}
