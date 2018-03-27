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
public abstract class Animal {
    //atributos
    protected float peso;
    protected int idade;
    protected int membros;
    //métodos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMembors() {
        return membros;
    }
    public void setMembros(int membors) {
        this.membros = membors;
    }

}
