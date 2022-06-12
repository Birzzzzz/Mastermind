public class Main {

    public static void main(String[] args){

        Piece p1 = new Piece(Color.BLACK,1);
        Piece p2 = new Piece(Color.BLUE,2);
        Piece p3 = new Piece(Color.RED,3);
        Piece p4 = new Piece(Color.YELLOW,4);
        Line l = new Line(p1,p2,p3,p4);
        System.out.println(l.toStringRound());

    }
}
