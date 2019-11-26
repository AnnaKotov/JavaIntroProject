package by.unit1.task.modul1.line;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    public static void main (String[] args) throws IOException {
        double x, y, z;
        double xRadian, yRadian;
        double divisor;
        BufferedReader reader;

        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter x, y \"in Degrees\"");
        x = Double.parseDouble(reader.readLine());
        y = Double.parseDouble(reader.readLine());
        xRadian = Math.toRadians(x);
        yRadian = Math.toRadians(y);
        divisor = Math.cos(xRadian) - Math.sin(yRadian);
        System.out.println(divisor);

        while (divisor == 0){
            System.out.println("division by zero" + "\n" + "Enter x, y");
            x = Double.parseDouble(reader.readLine());
            y = Double.parseDouble(reader.readLine());
            xRadian = Math.toRadians(x);
            yRadian = Math.toRadians(y);
            divisor = Math.cos(xRadian) - Math.sin(yRadian);

        }

        z = (Math.sin(x) + Math.cos(y)/divisor) * Math.tan(x*y);
        System.out.println(z);
        reader.close();
        }


    }

