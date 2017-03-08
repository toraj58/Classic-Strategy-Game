/**
 * Created by toraj on 01/14/2017.
 */
import java.util.Random;

public class RandomUtils extends Random {

    /**
     * @param min generated value. Can't be > then max
     * @param max generated value
     * @return values in closed range [min, max].
     */
    public int nextInt(int min, int max) {
        if (min == max) {
            return max;
        }

        return nextInt(max - min + 1) + min;
    }
}