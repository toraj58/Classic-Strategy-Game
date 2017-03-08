/**
 * Created by toraj on 01/14/2017.
 */
public class Tank {

    String name;
    short ammo;
    byte health;
    int strength;
    byte crew;
    TankColors tc;

    public Tank() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAmmo() {
        return ammo;
    }

    public void setAmmo(short ammo) {
        this.ammo = ammo;
    }

    public byte getHealth() {
        return health;
    }

    public void setHealth(byte health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public byte getCrew() {
        return crew;
    }

    public void setCrew(byte crew) {
        this.crew = crew;
    }

    public TankColors getTc() {
        return tc;
    }

    public void setTc(TankColors tc) {
        this.tc = tc;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "name='" + name + '\'' +
                ", ammo=" + ammo +
                ", health=" + health +
                ", strength=" + strength +
                ", crew=" + crew +
                ", tc=" + tc +
                '}';
    }
}
