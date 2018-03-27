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
public class Aluno extends Pessoa {
    //atributos
    private int matricula;
    private String curso;
    //metodos
    public void pagarMensal(){
        System.out.println(this.getNome()+"Pagou a mensalidade!");
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
