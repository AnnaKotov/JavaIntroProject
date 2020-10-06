package by.kotovaanna.modul1.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    // Find max{min(a,b), min(c,d)}

    public static void main (String[] args) throws IOException {
        int a, b, c, d;
        int min1, min2;
        int max;

        BufferedReader reader;
        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter four numbers: ");
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        c = Integer.parseInt(reader.readLine());
        d = Integer.parseInt(reader.readLine());
        reader.close();

       min1 = a > b ? b : a;
       min2 = c > d ? d : c;
       max = min1 > min2 ? min1 : min2;

        System.out.println(max);

    }
}
