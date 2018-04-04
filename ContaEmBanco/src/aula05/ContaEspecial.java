/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author edube
 */
public class ContaEspecial extends ContaBanco{
    
    private double limite;

    public ContaEspecial() {
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    
    @Override
    public boolean sacar(float v){
        
        double saldoLimite = getSaldo() + getLimite();
            if ((saldoLimite - v) >= 0) {
               this.setSaldo(this.getSaldo() - v);
               return true;
            }
            return false;
    }
    
    @Override
    public String toString() {
         String s = "";
        s += "Limite: "+getLimite()+"\n";
        s += super.toString()+"\n";
        return s;
    }
    
    
}
