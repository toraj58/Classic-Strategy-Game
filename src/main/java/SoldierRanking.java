import java.util.Random;

/**
 * Created by toraj on 01/14/2017.
 */
public enum SoldierRanking {

    Private, Sergeant, Lieutenant, Captain, Colonel, General;

    private static final SoldierRanking[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static SoldierRanking getRandom()  {
        return VALUES[RANDOM.nextInt(SIZE)];
    }
}
