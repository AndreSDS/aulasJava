package Threads;

public class MinhaThread implements Runnable{

    private String nome;
    private int tempo;
    private boolean foiTerminada;
    private boolean estaSuspensa;

    public MinhaThread(String nome, int tempo){
        this.nome = nome;
        this.estaSuspensa = false;
        this.tempo = tempo;
        new Thread(this,nome).start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 6; i++){
                System.out.println(nome + " contador "+ i);
                Thread.sleep(tempo);
                synchronized (this){
                    while (estaSuspensa){
                     wait();
                    }
                    if (this.foiTerminada){
                        break;
                    }
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(nome+" Terminou execução");
    }
    void suspend(){
        this.estaSuspensa = true;
    }

    synchronized void resumed(){
        this.estaSuspensa = false;
        notify();
    }

    synchronized void stop(){
        this.foiTerminada = true;
        notify();
    }
}
