/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula52;

/**
 *
 * @author edube
 */
public class Contato {
    
    private static int contador = 0;
    private int id;
    private String nome;
    private String telefone;
    private String email;

    public Contato() {
        contador++;
        id = contador;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String s = "";
        s += "ID: "+this.getId()+"\n";
        s += "Nome: "+this.getNome()+"\n";
        s += "Telefone: "+this.getTelefone()+"\n";
        s += "E-mail: "+this.getEmail()+"\n";
        return s;
    }
    
}
