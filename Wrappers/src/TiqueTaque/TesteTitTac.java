package TiqueTaque;

public class TesteTitTac {

    public static void main(String[] args) {

        TicTac tt = new TicTac();

        TicTacThread tic = new TicTacThread("Tic", tt);

        TicTacThread tac = new TicTacThread("Tac", tt);

        try {
            tic.t.join();
            tac.t.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
