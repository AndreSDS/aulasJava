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
public class Professor extends Pessoa{
    //atributos
    private String especialidade;
    private float salario;
    //métodos
    public void receberSalario(){
        System.out.println(this.getNome()+" recebeu salário!");
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
}
