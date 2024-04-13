package practice;

class Test19{
    public void m1(){
        System.out.println("SUPER CLASS M1");

    }


}
class Test20 extends Test19{

    @Override
    public void m1(){
        System.out.println("SUB CLASS M1");
    }

    public void m2(){
        System.out.println("SUB CLASS M2");
    }
}

class Test22{
    public static void main(String[] args) {
        Test19 t = new Test20();
        //t.m2();
    }
}
