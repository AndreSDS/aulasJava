/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

/**
 *
 * @author edube
 */
public abstract class FiguraGeometrica {
    
    private String nome;
    private String cor;

    public FiguraGeometrica() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "nome=" + nome + ", cor=" + cor + '}';
    }  
}
