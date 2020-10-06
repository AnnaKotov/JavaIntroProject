package by.kotovaanna.modul1.line;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main (String[] args) throws IOException {
        double xy1 [][] = new double[][]{{-2,2},{0,4}};
        double xy2 [][] = new double[][]{{-4,4}, {0, -3}};
        double xy [][] = new double[2][1];
        double x, y;
        boolean result;
        BufferedReader reader;

        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter x: ");
        x = Double.parseDouble(reader.readLine());
        System.out.println("Enter y: ");
        y = Double.parseDouble(reader.readLine());
        xy[0][0] = x;
        xy[1][0] = y;
        reader.close();

        if (xy[0][0] >= xy1[0][0] && xy[0][0] <= xy1[0][1] && xy[1][0] >= xy1[1][0] && xy[1][0] <= xy1[1][1]) {
            result = true;
        }
        else if (xy[0][0] >= xy2[0][0] && xy[0][0] <= xy2[0][1] && xy[1][0] <= xy2[1][0] && xy[1][0] >= xy2[1][1]){
            result = true;
        } else  result = false;

        System.out.println(result);


    }
}
