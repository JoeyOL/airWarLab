package edu.hitsz.prop;
import edu.hitsz.aircraft.HeroAircraft;

public class BloodProp extends BaseProp {
    public BloodProp(int locationX, int locationY, int speedX, int speedY, PropType type) {
        super(locationX, locationY, speedX, speedY,type);
    }
    @Override
    public boolean active(HeroAircraft heroAircraft) {
        if (super.active(heroAircraft)) {
            heroAircraft.increaseHp(20);
            return true;
        }
        return false;
    }

}
