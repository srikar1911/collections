package threads;


import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {

//        var currentThread = Thread.currentThread();
//        ThreadState(currentThread);
//
//        CustomThread customThread = new CustomThread();
//        Thread newThread = new Thread(() -> {
//            for (int i = 0; i < 5; i++){
//                System.out.print(" bye ");
//            }try{
//                Thread.sleep(250);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//       });
//              customThread.start();
//               newThread.start();
//
//        for(int i = 0; i < 5; i++){
//            System.out.print(" hello ");
//            try{
//                Thread.sleep(500);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        }
//
//        sleep(10000);
//        ThreadState(currentThread);
//        ThreadState(customThread);
//        ThreadState(newThread);
//

//
//        EvenThread01 evenThread = new EvenThread01();
//        Thread oddThread = new Thread(() -> {
//            for(int i = 1; i <=10; i+=2){
//                System.out.println("Odd Number = " + i );
//                try{
//                    Thread.sleep(1000);
//                }catch (InterruptedException e){
//                    System.out.println("OddThread interrupted!");
//                    break;
//
//                }
//            }
//        });
//        evenThread.start();
//        oddThread.start();
//
//        try{
//            Thread.sleep(2000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//
//     evenThread.interrupt();

        Thread newThread01 = new Thread(() -> {
            for(int i = 0; i < 5; i++) {
                System.out.println(i + " Thread01 ");
            }try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println("Thread interrupted");
            }
        });

        Thread newThread02 = new Thread(() -> {
            for(int i = 5; i < 10; i++) {
                System.out.println(i + " Thread02 ");
            }try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println("Thread interrupted");
            }
        });

        newThread01.start();
        try{Thread.sleep(1);
        }catch (InterruptedException e){}
        newThread02.start();
        newThread01.join();
        newThread02.join();

        System.out.println("Main Thread");
    }

    public static void ThreadState(Thread thread){
        System.out.println("====================================");
        System.out.println("Thread Id: "+ thread.getId());
        System.out.println("Thread Name: "+ thread.getName());
        System.out.println("Thread Priority: "+ thread.getPriority());
        System.out.println("Thread State: "+ thread.getState());
        System.out.println("Thread Group: "+ thread.getThreadGroup());
        System.out.println("Thread is Alive: "+ thread.isAlive());
    }

}
