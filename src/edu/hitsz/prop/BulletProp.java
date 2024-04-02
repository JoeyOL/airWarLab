package edu.hitsz.prop;
import edu.hitsz.aircraft.HeroAircraft;

public class BulletProp extends BaseProp {
    public BulletProp(int locationX, int locationY, int speedX, int speedY, PropType type) {
        super(locationX, locationY, speedX, speedY,type);
    }
    @Override
    public boolean active(HeroAircraft heroAircraft) {
        if (super.active(heroAircraft)) {
            System.out.println("FireSupply active!");
            return true;
        }
        return false;
    }

}

