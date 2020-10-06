package by.kotovaanna.modul1.line;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String [] args) throws IOException {
        int num;
        int hours, min, sec;
        BufferedReader reader;

        System.out.println("Введите натуральное число: ");
        reader = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(reader.readLine());
        reader.close();

        if (num < 1) {
            System.out.println("Error. Wrong number");
        }
        else {
            hours = num / 3600;
            min = (num % 3600) / 60;
            sec = (num % 3600) % 60;
            System.out.println(hours + "Ч " + min + "мин " + sec + "c");
        }




    }
}
