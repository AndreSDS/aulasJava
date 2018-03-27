/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivro;

/**
 *
 * @author edube
 */
public class Pessoa {
    //atributos
    private String nome;
    private int idade;
    private String sexo;
    //métodos get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String n) {
        this.nome = n;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int id) {
        this.idade = id;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String s) {
        this.sexo = s;
    }
    //construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    //método especial
    public void fazerAniversario(){
        this.idade = this.idade++;
    }
}
