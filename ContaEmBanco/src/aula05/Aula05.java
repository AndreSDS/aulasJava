
package aula05;

public class Aula05 {

    public static void main(String[] args) {
        
        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setNumConta(222);
        pessoa1.setDono("André");
        pessoa1.abrirConta("cc");
        pessoa1.depositar(500);
        pessoa1.sacar(200);
        pessoa1.estadoAtual();
    }
    
}
