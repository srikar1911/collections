package Collections;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;

public class HashSetSample {

    public static void main(String[] args) {

        HashSet<Object> hs = new HashSet<>();

        System.out.println(hs.add(1) +" -> " + hs);
        System.out.println(hs.add("1")+" -> " + hs);
        System.out.println(hs.add('1')+" -> " + hs);
        System.out.println(hs.add("a")+" -> " + hs);
        System.out.println(hs.add(6.7)+" -> " + hs);
        System.out.println(hs.add(new Ex("a", 5))+" -> " + hs);
        System.out.println(hs.add(new Ex("a", 5))+" -> " + hs);
        System.out.println(hs.add(new Sa(5, "a"))+" -> " + hs);
        System.out.println(hs.add(new Sa(5, "a"))+" -> " + hs);

//        System.out.println(hs);

        System.out.println(hs.contains(new Sa(5, "a")));
        System.out.println(hs.contains(new Sa(6, "a")));
        System.out.println(hs.contains("a"));
        System.out.println(hs.contains(new String("a")));




    }
}
