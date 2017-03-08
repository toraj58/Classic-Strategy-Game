import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.concurrent.CountDownLatch;

/**
 * Created by toraj on 01/14/2017.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Initiating Game...");

        System.out.println("********* War Game Strategy Simulator *********");
        System.out.println("*                                             *");
        System.out.println("*             Using CountDownLatch            *");
        System.out.println("*                  By Touraj                  *");
        System.out.println("*                                             *");
        System.out.println("***********************************************");

        Base base = new Base();
        WarField warField = new WarField();

        CountDownLatch latch = new CountDownLatch(3);

        Thread soldierProducer = new Thread(new SoldierProducer(base, latch), "SoldierProducerThread");
        Thread tankProducer = new Thread(new TankProducer(base, latch), "TankProducerThread");
        Thread fighterCraftProducer = new Thread(new FighterAirCraftProducer(base, latch), "FighterAirCraftProducerThread");

        Thread general = new Thread(new General(base, warField, latch), "GeneralThread");

        soldierProducer.start();
        tankProducer.start();
        fighterCraftProducer.start();

/*        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        general.start();

        System.out.println("Game Terminated");




    }
}
