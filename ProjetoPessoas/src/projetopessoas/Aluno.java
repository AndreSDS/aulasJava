/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopessoas;

/**
 *
 * @author edube
 */
public class Aluno extends Pessoa{
    //atributos
    private int matr;
    private String curso;

    //métodos
    public void cancelarMatr(){
        System.out.println("Matrícula será cancelada!");
    }
    public int getMatr() {
        return matr;
    }
    public void setMatr(int matr) {
        this.matr = matr;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
