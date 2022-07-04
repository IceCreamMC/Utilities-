package org.sharkurmc.utilities.java;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
    /**
     * Generate random int
     * @param min
     * @param max
     * @return int
     */
    public static int randomInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    /**
     * Generate random double
     * @param min
     * @param max
     * @return double
     */
    public static double randomDouble(double min, double max) {
        return ((Math.random() * (max - min)) + min);
    }

    /**
     * Generate random string
     * @param length
     * @return string
     */
    public static String randomString(int length) {
        Random random = new Random();

        return random.ints(48, 122 + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    /**
     * Generate random secure string
     * @param length
     * @return string
     */
    public static String randomSecureString(int length) {
        Random random = new SecureRandom();

        return random.ints(48, 122 + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
