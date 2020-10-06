package by.kotovaanna.modul1.loops;
// Для каждого натурального числа в промежутке от m до n вывести все делители кроме 1 и самого числа. m и n вводятся с клавиатуры

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main (String[] args) throws IOException {
        int m;
        int n;

        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        m = Integer.parseInt(reader.readLine());
        n = Integer.parseInt(reader.readLine());

        for (int i = m; i <= n ; i++) {
            for (int j = 2; j <i ; j++) {
                if(i % j == 0) System.out.println(j);
            }
        }
    }

    /*public static int getDivider(int n, int m){
        int div = 2;
        if(div == m) return m;
        else{
            return 0;
        }
    }*/
}
