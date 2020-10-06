package by.kotovaanna.modul1.loops;
// Найти произведение квадратов первых двухсот чисел

import java.math.BigDecimal;
import java.math.BigInteger;

public class Task4 {
    public static void main (String[] args) {
        BigInteger result = BigInteger.valueOf(1);

        for (int i = 1; i < 201 ; i++) {
          result = result.multiply(BigInteger.valueOf(i*i));
            System.out.println("Result: " + result);
        }
    }



}
