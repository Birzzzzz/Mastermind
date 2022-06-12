public class Piece {
    private Color color ;
    private int position;

    // constructor

    public Piece(Color color,int position){
        this.color = color;
        this.position = position;
    }

    // GETTER AND SETTER

    public int getPosition() {
        return position;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPosition(int position) {
        this.position = position;
    }

}
