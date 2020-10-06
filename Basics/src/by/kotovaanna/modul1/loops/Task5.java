package by.kotovaanna.modul1.loops;

//Даны числовой ряд и некоторое число е. Найти сумму членов ряда, модуль которых больше или равен заданному е.
// Общий член ряда имеет вид An = 1/2^n + 1/3^n

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task5 {
    public static void main (String[] args) throws IOException {
        double e;
        double num;
        double sum = 0;
        double[] sequence = new double[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        e = Double.parseDouble(reader.readLine());
        for (int i = 0; i < 10 ; i++) {
            num = 1/Math.pow(2, i) + 1/Math.pow(3, i);
            sequence[i] = num;
            if(num > e){
            sum+=num;
            }
        }
        System.out.println("Sum: " + sum);
    }

}
