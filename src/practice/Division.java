package practice;

public class Division {

public static float div(int fno, int sno) throws ArithmeticException, IllegalArgumentException{

    if (fno<0) throw new IllegalArgumentException("fno should not be a negative number");
    if (sno<=0) throw new ArithmeticException("sno should be grater than 0");

    return (float)fno/sno;
    }

}
