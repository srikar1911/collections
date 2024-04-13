package practice;

class A{
static int a = 10;
 int x = 20;

}
class BB extends A{
   static int a = 30;
    static int b = 40;

    int x = 50;
    int y = 60;

    void m1(){
        System.out.println(this.a + " ... " + super.a);
    }

}

class Test123{
    public static void main(String[] args) {
        BB b1 = new BB();
        b1.m1();
    }
}