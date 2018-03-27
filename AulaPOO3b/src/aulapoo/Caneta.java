package aulapoo;
/**
 *
 * @author edube
 */
public class Caneta {
    
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        String tampa;
        if (tampada == true) {
            tampa = "Sim!";
        }else{
            tampa = "Não";
        }
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Uma caneta "+this.cor+".");
        System.out.println("Ponta :"+this.ponta);
        System.out.println("Carga :"+this.carga);
        System.out.println("Está tampada? "+tampa+"!");
    }
    
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! Não posso rabiscar.");
        }else{
            System.out.println("Estou rabiscando!");
        }
    }
    
    protected void tampar(){
        this.tampada = true;
    }
    
    protected void destampar(){
        this.tampada = false;
    }
}
