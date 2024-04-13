package practice;


public class Example {
    int x =10;
    void m1(int p) {
        p =50;
    }

    void m2(Example e){

        e = new Example();
    }

    void m3(Example e){
        e.x = 15;
    }

    void m4(Example e){
        e = new Example();
        e.x =16;
    }

    void m5(Example e){
        e.x =19;
        e = new Example();
        e.x = 20;
        System.out.println("x value in m5: "+ e.x);
    }

}
