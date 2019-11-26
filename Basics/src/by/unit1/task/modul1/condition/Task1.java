package by.unit1.task.modul1.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    // Даны два угла определить существует ли треугольник, будет ли он прямоугольным

    public static void main (String[] args) throws IOException {
        double a;
        double b;
        double c;
        boolean isExist = false;
        boolean isRightTriangle = false;
        BufferedReader reader;

        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first angle: ");
        a = Double.parseDouble(reader.readLine());
        System.out.println("Enter the second angle: ");
        b = Double.parseDouble(reader.readLine());
        c = 180 - a - b;
        reader.close();

        if (a > 0 && b > 0 && c > 0){
            isExist = true;
        }
        if(a == 90 || b == 90 || c == 90){
            isRightTriangle = true;
        }
        if (isExist && isRightTriangle) {
            System.out.println("this triangle is the right triangle");
        }
        else if (isExist){
            System.out.println("triangle exists");
        }

        else System.out.println("triangle doesn't exist");

    }
}
