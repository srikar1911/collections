package practice;

public class Test06 {


    public static void main(String[] args) {
        System.out.println("hi");
            try {
                 System.out.println(10/0);
                System.out.println("hello");
                System.exit(0);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("WRU");
                System.exit(0);

            } finally {
                System.out.println("HRU");
            }
        System.out.println("Bye");
    }
}
