/**
 * Created by joaco on 9/10/14.
 */
public class HunterLogic extends Logic{

    public HunterLogic() {
        type = "Hunter";
    }

    @Override
    public void tick() {

    }

    @Override
    public void toPray(Ghost ghost) {
        ghost.logic = new PrayLogic();
    }

    @Override
    public void toDeath(Ghost ghost) {


    }

    @Override
    public void eaten(Ghost ghost) {

    }
}
