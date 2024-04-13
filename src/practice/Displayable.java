package practice;

public interface Displayable {
    default void display(){
        System.out.println("Hello, World");
    }
}

