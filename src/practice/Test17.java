package practice;

import lombok.Getter;

public class Test17 {
    @Getter
    private static int count;

    {
        count++;
    }

    Test17(){

    }
    Test17(String s){

    }
    Test17(int a){

    }


    public static void main(String[] args) {

        Test17 t1 = new Test17();
        Test17 t2 = new Test17(1);
        Test17 t3 = new Test17("dd");
        Test17 t4 = new Test17(4);
        Test17 t5 = new Test17("cd");
        Test17 t6 = new Test17();

        System.out.println(" no of object created is: "+ Test17.getCount());



    }
}
