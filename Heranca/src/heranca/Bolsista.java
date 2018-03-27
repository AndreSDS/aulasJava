/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author edube
 */
public class Bolsista extends Aluno {
    //atributos
    private float bolsa;
    //métods
    public void renovarBolsa(){
        System.out.println("Bolsa renovada!");
    }
    @Override
    public void pagarMensal(){
        System.out.println(this.getNome()+" é bolsista!");
    }
    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
