package by.kotovaanna.modul1.loops;
//Даны 2 числа. Определить цифры входящие в запись как первого так и второго числа.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task8 {
    public static void main (String[] args){
        int a = 52974;
        int b = 942589;
        int c;
        int temp;

        while (a > 0){
            temp = a % 10;
            a = a / 10;
            c = b;
           while ( c > 0){
               if(c%10 == temp){ System.out.println(temp);
               break;}
               else c =  c / 10;
           }
        }


    }


}
