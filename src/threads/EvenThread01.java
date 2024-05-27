package threads;

public class EvenThread01 extends Thread{

   @Override
    public void run(){
        for(int i = 0; i <=10; i+=2){
            System.out.println("Even Number = " + i );
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("EvenThread interrupted!");
                break;

            }
        }
    }
}

class OddRunnable implements Runnable{

    @Override
    public void run() {
        for(int i = 1; i <=10; i+=2){
            System.out.println("Odd Number = " + i );
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("OddThread interrupted!");
                break;

            }
        }
    }
}

