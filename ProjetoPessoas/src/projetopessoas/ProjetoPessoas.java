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
public class ProjetoPessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Pessoa p1 = new Pessoa();
       Aluno p2 = new Aluno();
       Professor p3 = new Professor();
       Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");
        
        p1.setSexo("M");
        p2.setIdade(18);
        p4.setSexo("F");
        
        p2.setCurso("informárica");
        p3.setSalario(2500);
        p4.setSetor("Estoque");
        
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
