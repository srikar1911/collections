package practice;

//Static members execution flow with multiple classes
class FirstClass{
    static int a = 10;

    static{
        System.out.println("FC SB1");
    }
    static int b = 20;
    static {
        System.out.println("FC SB2");
    }

    public static void main(String[] args) {
        System.out.println("MM");
    }
    static {
        System.out.println("FC SB3");
    }
    static int c = 30;
}
public class SecondClass {
    static int d = 50;
    static {
        System.out.println("SC SB1");
        System.out.println(FirstClass.a);
    }

    public static void main(String[] args) {
        System.out.println("SC Main");
        System.out.println(FirstClass.b);
    }
}

