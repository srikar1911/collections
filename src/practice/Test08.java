package practice;

public class Test08 {

    public static void main(String[] args) {
        System.out.println(m1());
    }

    static int m1() {
        try {
            return 10;
        } catch (ArithmeticException e) {
            return 20;
        } catch (NumberFormatException e) {
            return 30;
        } finally {
            System.out.println("bye");
        }
    }
}
