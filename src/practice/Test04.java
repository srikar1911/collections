package practice;

import java.util.Scanner;

public class Test04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            float c= a/b;
            System.out.println("Result : "+c);
        }catch (ArithmeticException e) {
            System.out.println("enter Non Zero number ");
        }
        catch (NumberFormatException e){
            System.out.println("enter only numbers");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Enter atleast two integers");
        }




    }



}
