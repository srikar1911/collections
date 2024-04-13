package practice;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class MyClass {

    private Map<String, Integer> map;

    public MyClass() {
        map = new HashMap<>();
        map.put("foo", 1);
        map.put("bar", 3);
    }
    //creating  a static variable
    @Getter
    private static int count;
    public int getValue(String input, int numRetries) throws NullPointerException {

        //creating a non-static block
        {
            count++;
        }

        try {
            return map.get(input);
        } catch (NullPointerException e) {
            if (numRetries > 3) {
                //printing the count variable
                System.out.println(getCount());
                throw e;

            }
            return getValue(input, numRetries + 1);
        }

    }

    public static void main(String[] args) throws NullPointerException {
        MyClass e1 = new MyClass();
        e1.getValue("baz", 0);


    }
}