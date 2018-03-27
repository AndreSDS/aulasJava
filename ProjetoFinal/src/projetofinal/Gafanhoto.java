/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

/**
 *
 * @author edube
 */
public class Gafanhoto extends Pessoa{
    //atributos
    private String login;
    private int assistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.assistido = 0;
    }
    //métodos
    public void viuMaisUm(){
        
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getAssistido() {
        return assistido;
    }
    public void setAssistido(int assistido) {
        this.assistido = assistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +super.toString()+ "login=" + login + ", assistido=" + assistido + '}';
    }
    
}
