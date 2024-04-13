package practice;

public class Test16 {
//    static {
//        System.out.println("SB");
//    }
//    static {
//        System.out.println("SB2");
//    }

    {
        System.out.println("NSB");
    }
    Test16(int a){
        System.out.println("PC");
    }
    Test16(){
        System.out.println("NPC");
    }

    public static void main(String[] args) {
        System.out.println("main");
        Test16 t = new Test16(5);
        Test16 t2 = new Test16();

    }
}
