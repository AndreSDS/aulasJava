package Threads;

public class Teste {
    public static void main(String[] args) {

        MinhaThread thread = new MinhaThread("Thread 1", 600);
        Thread t1 = new Thread(thread);

        MinhaThread thread2 = new MinhaThread("Thread 2", 900);
        Thread t2 = new Thread(thread2);

        MinhaThread thread3 = new MinhaThread("thread 3", 300);
        Thread t3 = new Thread(thread3);

        t1.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        t3.start();


        try {
            t1.join();
            t2.join();
            t3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Programa finalizado");
    }
}
