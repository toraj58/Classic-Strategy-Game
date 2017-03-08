import java.util.concurrent.CountDownLatch;

/**
 * Created by toraj on 01/14/2017.
 */
public class SoldierProducer implements Runnable {

    private Base base;
    private CountDownLatch latch;

    public SoldierProducer(Base base, CountDownLatch latch) {
        System.out.println("SoldierProducer Constructor");
        this.base = base;
        this.latch = latch;
    }

    public void run() {

        RandomUtils ru = new RandomUtils();

        for (int i = 1; i <= GameConfig.getMaxNumofSoldiers() ; i++) {

            Soldier s = new Soldier();
            s.setName(Util.randomStringSolid(5));
            s.setAmmo((short) ru.nextInt(200,300));
            s.setArmor((byte) ru.nextInt(80,100));
            s.setHealth((byte) ru.nextInt(90,100));
            s.setSr(SoldierRanking.getRandom());

            System.out.println("Soldier Produced : " + s.toString());

            base.addSoldier(s);

        }

        latch.countDown();

    }
}
