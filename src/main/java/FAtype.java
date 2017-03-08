import java.util.Random;

/**
 * Created by toraj on 01/14/2017.
 */
public enum FAtype {
    Falcon, Rafale,Eagle,Tomcat,Spitfire;

    private static final FAtype[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static FAtype getRandom()  {
        return VALUES[RANDOM.nextInt(SIZE)];
    }

}
