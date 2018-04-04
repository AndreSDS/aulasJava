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
public class Mamifero extends Animal{
    
    private String alimento;
    
    public Mamifero() {
        super();
        this.setCor("Castanho");
        this.alimento = "Mel";
        this.setAnbiente("Terra");
    } 

    /**
     * @return the alimento
     */
    public String getAlimento() {
        return alimento;
    }

    /**
     * @param alimento the alimento to set
     */
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "Alimento: "+this.getAlimento();
        return s;
    }
}
