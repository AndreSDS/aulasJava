/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliformismo;

/**
 *
 * @author edube
 */
public class Reptil extends Animal {
    //atributos
    private String corEscama;
    //métodos
    @Override
    public void locomover() {
        System.out.println("Rastejando!");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais!");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de réptil!");
    }
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }   
}
