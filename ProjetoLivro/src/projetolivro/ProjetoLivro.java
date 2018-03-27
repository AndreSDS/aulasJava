/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivro;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author edube
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro",22,"M");
        p[1] = new Pessoa("Ana",34,"F");
        
        l[0] = new Livro("Aprendendo POO","José Afim",400,p[0]);
        l[1] = new Livro("Estudando Curso","Guanabara Professor",200,p[1]);
        l[2] = new Livro("Tentando ser pai","André Souza",300,p[0]);
        
        l[0].abrir();
        l[0].avancarPag();
        l[0].folhear(122);
        
        System.out.println(l[0].detalhes());
    }
    
}
