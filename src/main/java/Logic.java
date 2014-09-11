/**
 * Created by joaco on 9/10/14.
 */
public abstract class Logic {
    protected String type;
    private int remainingTime;

    public abstract void tick();

    public abstract void toPray(Ghost ghost);

    public abstract void toDeath(Ghost ghost);

    public abstract void eaten(Ghost ghost);

    public int getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(int remainingTime) {
        this.remainingTime = remainingTime;
    }

    public void decrementRemainingTime(){
        if (remainingTime > 0)
            remainingTime--;
    }

    public boolean timeIsUp(){
        return remainingTime == 0;
    }

    public String logicType(){
        return this.type;
    }

}
