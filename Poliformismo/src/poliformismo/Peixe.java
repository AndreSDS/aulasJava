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
public class Peixe extends Animal {
    //atributos
    private String corEscama;
    //métodos
    @Override
    public void locomover() {
        System.out.println("Nadando!");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias!");
    }
    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som!");
    }
    public void fazerBolha(){
        System.out.println("Soltou bolha!");
    }
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    public void soltarBolha(){
        System.out.println("Soltou bolhar!");
    }
}
