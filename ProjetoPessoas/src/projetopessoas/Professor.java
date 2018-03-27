/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopessoas;

/**
 *
 * @author edube
 */
public class Professor extends Pessoa {    
    //atributos
   private String espec;
   private float salario;

   //métodos
   public void receberAumen(float aum){
       this.salario += aum;
   }
    public String getEspec() {
        return espec;
    }
    public void setEspec(String espec) {
        this.espec = espec;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
