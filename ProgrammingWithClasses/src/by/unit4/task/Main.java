package by.unit4.task;

import by.unit4.task.t1.Test1;
import by.unit4.task.t2.Test2;

public class Main {
    public static void main (String args[]) {

        // check class Test1

        Test1 t1 = new Test1(4, 5);
        System.out.println(t1.sumUp());
        System.out.println(t1.isBigger());
        t1.printTest1();

        // check class Test 2

        Test2 t2 = new Test2();
        Test2 t3 = new Test2(4,5);
    }

}
