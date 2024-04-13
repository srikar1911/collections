package practice;

public class Test11 {
    public static void main(String[] args) {

    }
    static void m4() {
//        throw new ClassNotFoundException();
    }
    static void m5() throws ClassNotFoundException{
     m4();
    }

    static void m10(){
        try{
            m5();
        }catch (ClassNotFoundException e){
            e.getMessage();
        }

    }

    class P {
        void m11() {

        }
    }
    class Q extends P{
        void m11() { }
    };


    class MyException extends ClassNotFoundException{

    }
    class A{
        void m22() throws ClassNotFoundException{ }
    }

    class B extends A{
        void m22(){ }
    }


    class M extends A{
        void m22() throws ClassNotFoundException{

            try{
//                Thread.sleep(100); // might throw Interrupted Exception
                throw new InterruptedException();
            }catch (InterruptedException e){ //since superclass method has no Interrupted exception, we wrap those exception in the exception that is allowed to throw in this class
                                            // this is called "exception chaining"
                throw new RuntimeException(e);
            }

        }
    }

    class Test111_CheckUncheckExceptionRules{
        public void main(String[] args) {
            try{
                A a1 = new M();
                a1.m22();
            }catch (ClassNotFoundException e){
                System.out.println("CNFE is raised");
            }catch (Exception e){
                Throwable cause = e.getCause();
                if (cause!=null){
                    cause.printStackTrace();
                }else{
                    e.printStackTrace();
                }
            }
        }
    }












}
