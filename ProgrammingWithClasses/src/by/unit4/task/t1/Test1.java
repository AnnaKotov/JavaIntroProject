package by.unit4.task.t1;

public class Test1 {
   private int var1;
   private int var2;

    public Test1(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    public int sumUp(){

       return var1 + var2;
    }

    public void printTest1(){
        System.out.println(var1 + ", " + var2);
    }
     public int isBigger(){

        if (var1>var2) return var1;
        else return var2;
     }
}
