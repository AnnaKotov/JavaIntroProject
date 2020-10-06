package by.kotovaanna.modul1.condition;

//Заданы размеры А и В прямоугольного отверстия и размеры x, y, z кирпича. Определить пройдёт ли кирпич через отверстие

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {

    public static void main(String[] args) throws IOException {

        int a = 10;
        int b = 15;
        int x, y, z;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите x, y и z: ");
        x = Integer.parseInt(reader.readLine());
        y = Integer.parseInt(reader.readLine());
        z = Integer.parseInt(reader.readLine());

        if( (a > x && b > y) || ( a > x && b > z) || (a > z && b > y )){
            System.out.println("Кирпич пройдёт в заданное отверстие");
        }else
        {
            System.out.println("Кирпич не пройдёт в заданное отверстие");
        }
        reader.close();
    }
}
