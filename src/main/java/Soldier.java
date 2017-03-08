/**
 * Created by toraj on 01/14/2017.
 */
public class Soldier {
    String name;
    byte health;
    short ammo;
    byte armor;
    SoldierRanking sr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getHealth() {
        return health;
    }

    public void setHealth(byte health) {
        this.health = health;
    }

    public short getAmmo() {
        return ammo;
    }

    public void setAmmo(short ammo) {
        this.ammo = ammo;
    }

    public byte getArmor() {
        return armor;
    }

    public void setArmor(byte armor) {
        this.armor = armor;
    }

    public SoldierRanking getSr() {
        return sr;
    }

    public void setSr(SoldierRanking sr) {
        this.sr = sr;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", ammo=" + ammo +
                ", armor=" + armor +
                ", sr=" + sr +
                '}';
    }
}
