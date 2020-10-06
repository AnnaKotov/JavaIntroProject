package by.kotovaanna.modul1.line;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        double a, b, c, d;
        BufferedReader reader;

        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a: ");
        a = Double.parseDouble(reader.readLine());
        while(a == 0) {
            System.out.println("a can't be 0, enter another number");
            a = Double.parseDouble(reader.readLine());
        }

        System.out.print("Enter b: ");
        b = Double.parseDouble(reader.readLine());
        System.out.print("Enter c: ");
        c = Double.parseDouble(reader.readLine());
        reader.close();

        d = ((b + Math.sqrt(b*b + 4*a*c)) / 2*a) - (Math.pow(a,3)*c + Math.pow(b,-2));
        System.out.println(d);


    }
}
