/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

/**
 *
 * @author edube
 */
public class Animal {
    
    private String nome;
    private float comprimento;
    private int numPatas;
    private String cor;
    private double velocidade;
    private String anbiente;

    public Animal() {
        this.numPatas = 4;
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
     * @return the comprimento
     */
    public float getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * @return the numPatas
     */
    public int getNumPatas() {
        return numPatas;
    }

    /**
     * @param numPatas the numPatas to set
     */
    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the velocidade
     */
    public double getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    /**
     * @return the anbiente
     */
    public String getAnbiente() {
        return anbiente;
    }

    /**
     * @param anbiente the anbiente to set
     */
    public void setAnbiente(String anbiente) {
        this.anbiente = anbiente;
    }

    @Override
    public String toString() {
        String s = "-----------------------------\n";
        s += "Animal: "+this.getNome()+"\n";
        s += "Comprimento: "+this.getComprimento()+" cm \n";
        s += "Patas: "+this.getNumPatas()+"\n";
        s += "Cor: "+this.getCor()+"\n";
        s += "Ambiente: "+this.getAnbiente()+"\n";
        s += "Velocidade: "+this.getVelocidade()+" m/s\n";
        return s;
    }
    
}
