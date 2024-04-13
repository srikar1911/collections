package practice;

public class Test07 {

    public static void main(String[] args) {
        int a = -1;
        try{
            a = 30;
            System.out.println(a);
            int b =1/0;
        }catch (ArithmeticException e){
            System.out.println(a);
        }finally {
            a = 20;
            System.out.println(a);
        }
        System.out.println(a);
    }

}
