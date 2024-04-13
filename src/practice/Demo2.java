package practice;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {


    public static void main(String[] args) {

        List<Employee2> empList = new ArrayList<>();

        empList.add(new Employee2(1, "M", 32000.0));
        empList.add(new Employee2(2, "M", 52000.0));
        empList.add(new Employee2(3, "F", 62000.0));
        empList.add(new Employee2(4, "F", 22000.0));



        System.out.println(empList.stream().filter(employee2 -> employee2.getGender() == "F"));
    }
}
