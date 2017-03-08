import java.util.concurrent.CountDownLatch;

/**
 * Created by toraj on 01/15/2017.
 */
public class FighterAirCraftProducer implements Runnable{

    private Base base;
    private CountDownLatch latch;

    public FighterAirCraftProducer(Base base, CountDownLatch latch) {
        this.base = base;
        this.latch = latch;

    }

    public void run() {

        RandomUtils ru = new RandomUtils();

        for (int i = 1; i <=GameConfig.getMaxNumofFighterCrafts() ; i++) {

            FighterAircraft fa = new FighterAircraft();
            fa.setName(Util.randomStringSolid(5));
            fa.setCrew((byte) ru.nextInt(1,2));
            fa.setAmmo((short) ru.nextInt(17000,19000));
            fa.setHealth((byte) ru.nextInt(900,1000));
            fa.setMissiles((byte) ru.nextInt(2,8));
            fa.setFatype(FAtype.getRandom());

            System.out.println("FighterAircraft Produced : " + fa.toString());

            base.addFighterAircraft(fa);

        }

        latch.countDown();


    }
}
