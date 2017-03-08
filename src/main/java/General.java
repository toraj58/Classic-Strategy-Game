import java.util.concurrent.CountDownLatch;

/**
 * Created by toraj on 01/15/2017.
 */
public class General implements Runnable {

    private Base base;
    private WarField warField;
    private CountDownLatch latch;

    public General(Base base, WarField warField, CountDownLatch latch) {
        this.base = base;
        this.warField = warField;
        this.latch = latch;

    }

    public void Wander() {
        System.out.println("General is Wandering Around...");
    }

    public void attack() {
        System.out.println("General is Attacking Enemy...");

    }

    public void idle() {
        System.out.println("General is Idle...");

    }

    public void drinkTea() {
        System.out.println("General is Drinking Tea...");

    }

    public void orderAttack() {
        System.out.println("General Ordered Attacking Enemy....");

    }

    public void run() {

        System.out.println("General Thread Running");

        //Touraj : Waiting on the Latch to be Depleted...

        try {

            latch.await();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i <GameConfig.getMaxNumofSoldiers() ; i++) {

            Soldier s = base.getSoldiers().remove(0);
            System.out.printf("Soldier %s added to WarField \n", s.getName());
            warField.addSoldier(s);

        }

        for (int i = 0; i <GameConfig.getMaxNumofTanks() ; i++) {

            Tank t = base.getTanks().remove(0);
            System.out.printf("Tank %s added to WarField \n", t.getName());

            warField.addTanks(t);
        }

        for (int i = 0; i <GameConfig.getMaxNumofFighterCrafts() ; i++) {

            FighterAircraft fa = base.getFighterAircrafts().remove(0);
            System.out.printf("FighterAircraft %s added to WarField \n", fa.getName());

            warField.addFighterAircraft(fa);

        }

        orderAttack();

    }
}
