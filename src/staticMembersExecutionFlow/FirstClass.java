package staticMembersExecutionFlow;

public class FirstClass {

        static {
            System.out.println("FC SB0");
           /* System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
           */
            System.out.println(FirstClass.a);
            System.out.println(FirstClass.b);
            System.out.println(FirstClass.c);
        }

        {
            System.out.println("NSB1");
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
//            System.out.println(d);
            System.out.println(FirstClass.a);
            System.out.println(FirstClass.b);
            System.out.println(FirstClass.c);
            System.out.println(SecondClass.d);
        }

        static int a = 10;

        static {
            System.out.println("FC SB1");
            System.out.println(a);
//            System.out.println(b);
//            System.out.println(c)
//            System.out.println(d);
            System.out.println(FirstClass.a);
            System.out.println(FirstClass.b);
            System.out.println(FirstClass.c);
        }

        static int b = 20;

        static {
            System.out.println(a);
            System.out.println(b);
//            System.out.println(c);
//            System.out.println(d);
            System.out.println(FirstClass.a);
            System.out.println(FirstClass.b);
            System.out.println(FirstClass.c);
            System.out.println("FC SB2");
        }

        public static void main(String[] args) {
            System.out.println("MM");
        }

        static {
            System.out.println("FC SB3");
            System.out.println(a);
            System.out.println(b);
//            System.out.println(c);
//            System.out.println(d);
            System.out.println(FirstClass.a);
            System.out.println(FirstClass.b);
            System.out.println(FirstClass.c);

        }

        static int c = 30;

        public void m1() {
            System.out.println("M1 method in first class");
        }

    }
