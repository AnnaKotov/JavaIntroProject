package by.kotovaanna.modul1.condition;

// Вычислить значение функции

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main (String[] args) throws IOException {
        double x;
        double y;

        System.out.println("Enter x: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        x = Double.parseDouble(reader.readLine());

        if (x <= 3){
            y = Math.pow(x,2.0) - 3 * x + 9;
        }else
        {
            y = 1 / (Math.pow(x,3.0) + 6);
        }
        System.out.println("Result: " + y);
        reader.close();

    }
}
