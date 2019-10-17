package by.unit4.task;

import by.unit4.task.t1.Test1;

public class Main {
    public static void main (String args[]) {
        Test1 t = new Test1(4, 5);
        System.out.println(t.sumUp());
        System.out.println(t.isBigger());
        t.printTest1();
    }

}
