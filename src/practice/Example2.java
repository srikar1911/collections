package practice;

public class Example2 {
    int x = 10;
    {
        System.out.println("From NSB ");
        System.out.println("x = " + x);
        System.out.println("y = "+ this.y);
    }
    Example2(){
        System.out.println("\n from Constructor ");
        System.out.println("x = " + x);
        System.out.println("y = "+ y);
    }

    public static void main(String[] args) {
        System.out.println("main Start");
        Example2 e1 = new Example2();
        System.out.println("\nx = " + e1.x);
        System.out.println("y = "+ e1.y);
    }
    int y = 20;
}

