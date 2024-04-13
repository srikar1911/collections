package Collections;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetSample {

    public static void main(String[] args) {

        TreeSet<Object> ts = new TreeSet<>();
        ts.add("a");
        ts.add("b");
        ts.add("c");
        ts.add("d");
        ts.add("e");
        System.out.println(ts);
    //only homogenous and unique elements are allowed to store
        TreeSet<Object> ts2 = new TreeSet<>();
        ts2.add(3);
        ts2.add(6);
        ts2.add(2);
        ts2.add(4);
        ts2.add(7);

//        ts.add(8.7);
//        ts.add(3f);
        System.out.println(ts2);




    }


}
