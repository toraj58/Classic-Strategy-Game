import java.util.Random;

/**
 * Created by toraj on 01/14/2017.
 */
public enum TankColors {
    Black, White, Green, Brown;

    private static final TankColors[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static TankColors getRandom()  {
        return VALUES[RANDOM.nextInt(SIZE)];
    }
}
