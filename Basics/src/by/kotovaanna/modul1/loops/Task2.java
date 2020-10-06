package by.kotovaanna.modul1.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Вычислить значеие функции на отрезке [a,b] с шагом h
 y = { x, x > 2; -x, x<=2}*/
public class Task2 {
    public static void main (String[] args) throws IOException {
        double a, b, h, y;
        System.out.println("Enter a, b, h: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        a = Double.parseDouble(reader.readLine());
        b = Double.parseDouble(reader.readLine());
        h = Double.parseDouble(reader.readLine());

        while (a <= b){
            y = a > 2 ? a : -a;
            System.out.println(y);
            a+=h;
        }
    }

}
