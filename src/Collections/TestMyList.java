package Collections;

public class TestMyList {

    public static void main(String[] args) {

        MyList<Object> ml = new MyList<Object>();
        ml.add("a");
        ml.add("b");
        ml.add(8);
        ml.add(9.8);
        ml.add(null);
        System.out.println("Size = "+ml.size());
        System.out.println("Capacity = "+ml.capacity());
        ml.add('e');
        ml.add("Hello");
        ml.add(1f);
        ml.add(null);
        ml.add(90);
        System.out.println("Size = "+ml.size());
        System.out.println("Capacity = "+ml.capacity());
        ml.add("y");
        ml.add("z");
        ml.add(null);
        ml.add('e');
        ml.add("Hello");
        ml.add(1f);
        System.out.println("Size = "+ml.size());
        System.out.println("Capacity = "+ml.capacity());
        ml.add(null);
        ml.add(90);
        ml.add("y");
        ml.add("z");
        System.out.println("Size = "+ml.size());
        System.out.println("Capacity = "+ml.capacity());
        ml.add("y");
        ml.add("z");
        System.out.println("Size = "+ml.size());
        System.out.println("Capacity = "+ml.capacity());
        System.out.println(ml.get(9));
        System.out.println(ml);

    }

}
