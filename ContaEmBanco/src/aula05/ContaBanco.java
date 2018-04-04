
package aula05;

public class ContaBanco {
    private String Cliente;
    private int numConta;
    private double saldo;
   
    public void depositar(double v){
        this.setSaldo(getSaldo() + v);
    }
    public boolean sacar(float v){
            if ((this.getSaldo() - v) >= 0) {
               this.setSaldo(this.getSaldo() - v);
               return true;
            }
            return false;
    }

    /**
     * @return the Cliente
     */
    public String getCliente() {
        return Cliente;
    }

    /**
     * @param Cliente the Cliente to set
     */
    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    /**
     * @return the numConta
     */
    public int getNumConta() {
        return numConta;
    }

    /**
     * @param numConta the numConta to set
     */
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Nome do cliente: "+getCliente()+"\n";
        s += "Número da conta: "+getNumConta()+"\n";
        s += "Saldo: "+getSaldo()+"\n";
        s += ("----------------------------------------");
        return s; //To change body of generated methods, choose Tools | Templates.
    }
}
