package edu.hitsz.prop;

import edu.hitsz.aircraft.HeroAircraft;
import edu.hitsz.application.Main;
import edu.hitsz.basic.AbstractFlyingObject;

public abstract class BaseProp extends AbstractFlyingObject {

    protected PropType type;
    public BaseProp(int locationX, int locationY, int speedX, int speedY, PropType type) {
        super(locationX, locationY, speedX, speedY);
        this.type = type;
    }
    @Override
    public void forward(){
        super.forward();
        if (speedY > 0 && locationY >= Main.WINDOW_HEIGHT ) {
            // 向下飞行出界
            vanish();
        }
    }
    public PropType getType(){ return this.type;}
    public boolean active(HeroAircraft heroAircraft){
        if (!heroAircraft.crash(this)) return false;
        if (notValid()) return false;
        return true;
    }
}
