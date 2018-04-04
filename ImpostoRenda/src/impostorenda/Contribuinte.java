/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impostorenda;

/**
 *
 * @author edube
 */
public abstract class Contribuinte {
    
    private String nome;
    private double rendaBruta;

    public Contribuinte(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the rendaBruta
     */
    public double getRendaBruta() {
        return rendaBruta;
    }

    /**
     * @param rendaBruta the rendaBruta to set
     */
    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }
    
    /**
     *
     * @return
     */
    public abstract double calcularImposto();

    @Override
    public String toString() {
        String s = "Nome: "+getNome()+"\n";
        s += "Renda bruta: "+getRendaBruta()+"\n";
        
        return s;
    }
   

}
