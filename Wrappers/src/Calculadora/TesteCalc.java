package Calculadora;

import Threads.MinhaThread;

public class TesteCalc {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        CalcThreads c1 = new CalcThreads("1", array);
        CalcThreads c2 = new CalcThreads("2", array);
    }
}
