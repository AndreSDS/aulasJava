
package aula05;

public class Teste {

    public static void main(String[] args) {
        
        System.out.println("++++++ Teste conta bancária ++++++");
        System.out.println("----------------------------------------");
        
        ContaBanco contaSimples = new ContaBanco();
        contaSimples.setCliente("Cliente Conta Simples");
        contaSimples.setNumConta(112223);
        contaSimples.depositar(2000);
        contaSimples.sacar(200);
        contaSimples.sacar(2000);
        
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setCliente("Conta poupança");
        contaPoupanca.setNumConta(222234);
        contaPoupanca.setDiaRendimento(3);
        contaPoupanca.depositar(200);
        contaPoupanca.sacar(80);
        
        if (contaPoupanca.calcularNovoSaldo(0.5)) {
            System.out.println("Rendimento aplicado, saldo atual : "+contaPoupanca.getSaldo());
        }else{
            System.out.println("Hoje não é dia de rendimento");
        }
        
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setCliente("Conta Especial");
        contaEspecial.setNumConta(552234);
        contaEspecial.depositar(200);
        contaEspecial.setLimite(80);
        contaEspecial.sacar(290);
        
        System.out.println(contaSimples);
        System.out.println(contaPoupanca);
        System.out.println(contaEspecial);
    }
}
