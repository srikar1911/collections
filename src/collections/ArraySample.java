package collections;

import java.util.ArrayList;

public class ArraySample {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Initial Size of al array is: "+al.size());

        al.add(2);
        System.out.println("Size of al array after adding element is: "+al.size());

        al.contains(2);

        ArraySample s1 = new ArraySample();
        System.out.println( s1.getClass());
    }


}
