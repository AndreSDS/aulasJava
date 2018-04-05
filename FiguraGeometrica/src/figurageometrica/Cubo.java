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
public class Cubo extends Figura3D{
    
    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (Math.pow(lado, 2) * 6);
    }
    
    @Override
    public double calcularVolume() {
        return Math.pow(lado, 3);
    }
}
