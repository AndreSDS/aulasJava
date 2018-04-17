package Threads;

public class Teste {
    public static void main(String[] args) {

        MinhaThread thread = new MinhaThread("Thread 1", 600);

        MinhaThread thread1 = new MinhaThread("Thread 2", 900);

        thread.suspend();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.suspend();

        thread.resumed();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.resumed();

        thread1.stop();

        System.out.println("Programa finalizado");
    }
}
