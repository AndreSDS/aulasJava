package Threads;

public class Teste {
    public static void main(String[] args) {

        MinhaThread thread = new MinhaThread("Thread 1", 600);
        Thread thread1 = new Thread(thread);

        MinhaThread thread2 = new MinhaThread("Thread 2", 900);
        Thread thread3 = new Thread(thread2);

        thread1.start();
        thread3.start();

        try {
            thread1.join();
            thread3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Programa finalizado");
    }
}
