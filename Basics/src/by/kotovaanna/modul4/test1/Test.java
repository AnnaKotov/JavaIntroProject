package by.kotovaanna.modul4.test1;

public class Test {
    private int a;
    private int b;

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "a: " + a + "\n" + "b: " + b;
    }

    public int sum(){
        return a + b;
    }
    public int isBigger(){
        if(a>b)return a;
        else return b;
    }

    public static void main (String[] args){

        Test test = new Test(5,10);
        System.out.println(test.toString());
        System.out.println("sum: " + test.sum());
        System.out.println("bigger num is " + test.isBigger());

        test.setA(17);
        System.out.println(test.isBigger());
    }
}
