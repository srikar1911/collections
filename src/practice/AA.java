package practice;

public class AA {
    AA(int x ){
        System.out.println("hi");
    }


}
class B extends AA{
    B(int x) {
        super(x);
        System.out.println("hello");
    }
}
