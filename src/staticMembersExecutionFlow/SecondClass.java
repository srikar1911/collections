package staticMembersExecutionFlow;

public class SecondClass {
    static int d = 50;

    static {
        System.out.println("SC SB1");
        System.out.println(FirstClass.a);
    }

    public static void main(String[] args) {
        System.out.println("SC Main");
        System.out.println(FirstClass.b);
        FirstClass f1 = new FirstClass();
        f1.m1();
    }
}



