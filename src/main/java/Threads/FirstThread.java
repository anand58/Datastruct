package Threads;

public class FirstThread implements Runnable{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        FirstThread ft = new FirstThread();
        Thread th = new Thread(ft);
        th.start();

        FirstThread ft1 = new FirstThread();
        Thread th2 = new Thread(ft1);
        th2.start();

        FirstThread ft2 = new FirstThread();
        Thread th3 = new Thread(ft2);
        th3.start();
    }

    public void run(){
        System.out.println("Printed by:"+Thread.currentThread());
    }
}
