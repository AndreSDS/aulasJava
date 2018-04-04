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
public class Peixe extends Animal{
    
    private String caracteristicas;

    public Peixe() {
        super();
        this.setNumPatas(0);
        this.setAnbiente("Mar");
        this.setCor("Cinzenta");
        this.setCaracteristicas("Barbatanas e cauda");
    }

    /**
     * @return the caracteristicas
     */
    public String getCaracteristicas() {
        return caracteristicas;
    }

    /**
     * @param caracteristicas the caracteristicas to set
     */
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = "Barbatanas e Cauda";
    }

    @Override
    public String toString() {
      String s = super.toString();
      s += "Características: "+this.getCaracteristicas();
      return s;
    }
}
