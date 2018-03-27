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
public class AlunoTecnico extends Aluno {
    //atributos
    private int regProfissional;
    //métodos
    public void praticar(){
        System.out.println(this.getNome()+" está praticando!");
    }

    public int getRegProfissional() {
        return regProfissional;
    }
    public void setRegProfissional(int regProfissional) {
        this.regProfissional = regProfissional;
    }  
}
