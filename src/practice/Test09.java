package practice;

public class Test09 {
    public static void main(String[] args){
        m1();
    }
    static void m1(){
     try {
         m2();
     }catch (Exception e){
         System.out.println(e.getMessage());
     }
    }
    static void m2(){
        System.out.println(1/0);
    }
}
