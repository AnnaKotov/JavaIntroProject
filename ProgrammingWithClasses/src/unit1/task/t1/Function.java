package unit1.task.t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Function {
    // найти значение функции


    public static void main (String [] args) throws IOException {
        double a,b,c,z;
        BufferedReader reader;
        reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a: ");
        a = Double.parseDouble(reader.readLine());
        System.out.print("Enter b: ");
        b = Double.parseDouble(reader.readLine());
        System.out.print("Enter c: ");
        c = Double.parseDouble(reader.readLine());
        z = ((a-3) * b/2) + c;
        System.out.println("z = ((a-3) * b/2) + c" +"\n" + "z = " + z);

    }

}
