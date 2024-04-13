package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test05 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();

            try {
                int[] arr1 = new int[a];

            } catch (NegativeArraySizeException e) {
                System.out.println("enter non negative number ");
            }

            int b = a + 60;
            System.out.println("b is : "+b);

        }catch (InputMismatchException exception){
            System.out.println("Enter a number ");
        }
    }
}