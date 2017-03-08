import java.util.Vector;

/**
 * Created by toraj on 01/14/2017.
 */
public class WarField {

    Vector<Soldier> soldiers = new Vector<Soldier>();
    Vector<Tank> tanks = new Vector<Tank>();
    Vector<FighterAircraft> fighterAircrafts = new Vector<FighterAircraft>();

    public WarField(Vector<Soldier> soldiers, Vector<Tank> tanks, Vector<FighterAircraft> fighterAircrafts) {
        this.soldiers = soldiers;
        this.tanks = tanks;
        this.fighterAircrafts = fighterAircrafts;
    }

    public WarField() {
    }

    public Vector<Soldier> getSoldiers() {
        return soldiers;
    }

    public void addSoldier(Soldier s) {
        soldiers.add(s);

    }

    public void addTanks(Tank t) {
        tanks.add(t);

    }

    public void addFighterAircraft(FighterAircraft f) {
        fighterAircrafts.add(f);

    }

    public void setSoldiers(Vector<Soldier> soldiers) {
        this.soldiers = soldiers;
    }

    public Vector<Tank> getTanks() {
        return tanks;
    }

    public void setTanks(Vector<Tank> tanks) {
        this.tanks = tanks;
    }

    public Vector<FighterAircraft> getFighterAircrafts() {
        return fighterAircrafts;
    }

    public void setFighterAircrafts(Vector<FighterAircraft> fighterAircrafts) {
        this.fighterAircrafts = fighterAircrafts;
    }
}
