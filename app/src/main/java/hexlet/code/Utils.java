package hexlet.code;

import java.util.Random;

public final class Utils {
    public static int getRandomInt(int a) {
        int result = getRandomInt(0, a);
        return result;
    }

    public static int getRandomInt(int low, int high) {
        Random generator = new Random();
        int result = low + generator.nextInt(high);

        return result;
    }

    public static String convertBool2YesNo(boolean expression) {
        String result = expression ? "yes" : "no";

        return result;
    }
}
