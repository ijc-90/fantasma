/**
 * Created by joaco on 9/10/14.
 */
public class PrayLogic extends Logic{


    public PrayLogic() {
        type = "Pray";
    }

    @Override
    public void tick() {

    }

    @Override
    public void toPray(Ghost ghost) {
    }

    @Override
    public void toDeath(Ghost ghost) {
        ghost.logic = new DeathLogic();
    }

    @Override
    public void eaten(Ghost ghost) {
        toDeath(ghost);
    }
}
