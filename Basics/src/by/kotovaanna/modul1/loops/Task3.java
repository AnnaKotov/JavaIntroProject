package by.kotovaanna.modul1.loops;
//Найти сумму квадратов первых 100 чисел

public class Task3 {
    public static void main (String[] args){
        int sum = 0;
        for (int i = 1; i < 101 ; i++) {
            sum +=Math.pow(i,2.0);
        }
        System.out.println(sum);
    }

}
