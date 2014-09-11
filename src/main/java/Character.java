/**
 * Created by joaco on 9/10/14.
 */
public abstract class Character implements Movable, Positionable{

    private Position position;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void move(){

    }

}
