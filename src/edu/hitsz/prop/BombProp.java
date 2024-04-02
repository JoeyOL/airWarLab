package edu.hitsz.prop;
import edu.hitsz.aircraft.HeroAircraft;

public class BombProp extends BaseProp {
    public BombProp(int locationX, int locationY, int speedX, int speedY, PropType type) {
        super(locationX, locationY, speedX, speedY,type);
    }
    @Override
    public boolean active(HeroAircraft heroAircraft) {
        if (super.active(heroAircraft)) {
            System.out.println("BombSupply active!");
            return true;
        }
        return false;
    }

}
