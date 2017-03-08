import java.util.concurrent.CountDownLatch;

/**
 * Created by toraj on 01/14/2017.
 */
public class TankProducer implements Runnable {
    private Base base;
    private CountDownLatch latch;

    public TankProducer(Base base, CountDownLatch latch) {
        this.base = base;
        this.latch = latch;

    }

    public void run() {

        RandomUtils ru = new RandomUtils();

        for (int i = 1; i <=GameConfig.getMaxNumofTanks() ; i++) {
            Tank tank = new Tank();
            tank.setName(Util.randomStringSolid(5));
            tank.setAmmo((short) ru.nextInt(5000,8000));
            tank.setHealth((byte) ru.nextInt(800,1000));
            tank.setCrew((byte) ru.nextInt(2,5));
            tank.setStrength(ru.nextInt(10000,12000));
            tank.setTc(TankColors.getRandom());

            System.out.println("Tank Produced : " + tank.toString());

            base.addTanks(tank);

        }

        latch.countDown();


    }
}
