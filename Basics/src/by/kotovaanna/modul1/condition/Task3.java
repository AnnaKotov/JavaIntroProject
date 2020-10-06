package by.kotovaanna.modul1.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    // to check if three points are collinear.

    public static void main (String[] args) throws IOException {

        double coordinate [][] = new double[2][3];
        double x1, x2, x3, y1, y2, y3;
        double s;
        String line;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3 ; i++) {
            System.out.println("Enter coordinate: ");
            line = reader.readLine();
            coordinate[0][i] = Double.parseDouble(line.split(",")[0]);
            coordinate[1][i] = Double.parseDouble(line.split(",")[1]);
        }

        x1 = coordinate[0][0];
        y1 = coordinate[1][0];
        x2 = coordinate[0][1];
        y2 = coordinate[1][1];
        x3 = coordinate[0][2];
        y3 = coordinate[1][2];

        s = (x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3);

        if(s == 0) {
            System.out.println("points are collinear");
        }else {
            System.out.println("points aren't collinear");
        }



    }
}
