
package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo :"+this.getTipo());
        System.out.println("Dono :"+this.getDono());
        System.out.println("Saldo :"+this.getSaldo());
        if (this.getStatus() == true) {
        System.out.println("Status : Conta aberta!");
        }else{
        System.out.println("Status : Conta fechada!");
        }
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "cc" || t == "CC") {
            this.setSaldo(50f);
        }else if (t == "cp" || t == "CP") {
            this.setSaldo(150f);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Há dinheiro na conta!");
        }else if (this.getSaldo() < 0) {
            System.out.println("Saldo negativo!"); 
        }else{
            this.setStatus(false);
        }
    }
    public void depositar(float v){
        if (this.getStatus()) {
           this.setSaldo(this.getSaldo() + v);
            System.out.println("Valor depositado: "+v);
        }else{
            System.out.println("Impossível depositar!");
        }
    }
    public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
               this.setSaldo(this.getSaldo() - v);
                System.out.println("Valor sacado: "+v);
            }else{
                System.out.println("Saldo insuficiente!");
            }
        }else{
            System.out.println("Impossível sacar!");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC" || this.getTipo() == "cc") {
            v = 12;
        }else if (this.getTipo() == "cp" || this.getTipo() == "CP") {
            v =20;
        }
        if (this.getStatus() == true) {
            if (this.getSaldo() > v) {
               this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso!");
            }
        }else{
            System.out.println("Impossível efetuar pagamento!");
        }
    }

    public String getDono() {
        return dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int n) {
        this.numConta = n;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float s) {
        this.saldo = s;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean sta) {
        this.status = sta;
    }
    public ContaBanco() {//metodo construtor
        this.setSaldo(0);
        this.setStatus(false);
    }
}
