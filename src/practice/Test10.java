package practice;

public class Test10 {

    public static void main(String[] args)  {
        System.out.println("main start");
       //m1(-10);
       m1(9);
        System.out.println("Main end");
    }

    static void m1(int a) throws IllegalArgumentException, IllegalStateException{
        if(a<0)
            throw new IllegalArgumentException("Do not pass negative number");

        if(a>0 && a<10)
            throw new IllegalStateException("Do not pass number less than 10");
        System.out.println("Hi");
    }
}
