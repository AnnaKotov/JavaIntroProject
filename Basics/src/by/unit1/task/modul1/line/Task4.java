package by.unit1.task.modul1.line;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Task4 {

    public static void main(String[] args) throws IOException {
        double num;
        int a;
        int b;
        String num_txt;
        String s1;
        String s2;
        String s3;
        BufferedReader reader;


        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите действительное число вида \" nnn.ddd \" :");
        num = Double.parseDouble(reader.readLine());
        num_txt = String.valueOf(num);
        s1 = num_txt.substring(0,3);
        s2 = num_txt.substring(3,4);
        s3 = num_txt.substring(4);

        num_txt = s3 + s2 + s1;

        num = Double.parseDouble(num_txt);
        System.out.println(num);
        reader.close();






    }
}
