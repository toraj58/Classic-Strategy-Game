/**
 * Created by toraj on 01/14/2017.
 */
public class FighterAircraft {
    String name;
    int ammo;
    byte missiles;
    byte crew;
    short health;
    FAtype fatype;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public byte getMissiles() {
        return missiles;
    }

    public void setMissiles(byte missiles) {
        this.missiles = missiles;
    }

    public byte getCrew() {
        return crew;
    }

    public void setCrew(byte crew) {
        this.crew = crew;
    }

    public short getHealth() {
        return health;
    }

    public void setHealth(short health) {
        this.health = health;
    }

    public FAtype getFatype() {
        return fatype;
    }

    public void setFatype(FAtype fatype) {
        this.fatype = fatype;
    }

    @Override
    public String toString() {
        return "FighterAircraft{" +
                "name='" + name + '\'' +
                ", ammo=" + ammo +
                ", missiles=" + missiles +
                ", crew=" + crew +
                ", health=" + health +
                ", fatype=" + fatype +
                '}';
    }
}
