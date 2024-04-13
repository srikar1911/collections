package Threads;


import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        var currentThread = Thread.currentThread();
        CustomThread customThread = new CustomThread();
        Thread newThread = new Thread(() -> {
            for (int i = 0; i < 5; i++){
                System.out.print(" bye ");
            }try{
                Thread.sleep(250);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        customThread.start();
        newThread.start();


        for(int i = 0; i < 5; i++){
            System.out.print(" hello ");
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        sleep(10000);
        ThreadState(currentThread);
        ThreadState(customThread);
        ThreadState(newThread);



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
