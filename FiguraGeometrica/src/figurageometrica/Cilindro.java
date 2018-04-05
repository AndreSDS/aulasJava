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
public class Cilindro extends Figura3D{
    
    private double altura;
    private double raio;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double areaBase = Math.pow(raio, 2) * altura;
        double areLateral = Math.PI * 2 * raio * altura;
        
        return areLateral + (areaBase * 2);
    }
    
    @Override
    public double calcularVolume() {
        return (Math.pow(raio, 2)* altura * Math.PI);
    }

}
