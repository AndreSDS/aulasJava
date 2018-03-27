/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author edube
 */
public class Ave extends Animal {
    //atributos
    private String corPena;
    //métodos
    @Override
    public void locomover() {
        System.out.println("Voando!");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo frutas!");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de ave!");
    }
    public void fazerNinho(){
        System.out.println("Construiu ninho!");
    }
    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
