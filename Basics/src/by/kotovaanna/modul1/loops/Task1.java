package by.kotovaanna.modul1.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main (String[] args) throws IOException {
        int num;
        int sum = 0;

        System.out.println("Enter positive integer: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= num ; i++) {
            sum+=i;
        }
        System.out.println("Sum: " + sum);

    }
// recursion vers
    static int sumUp(int num){
        if (num == 1) return 1;
        else return  num + sumUp(num -1);
    }
}
