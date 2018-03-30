/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorelacinamentoclasses;

import java.util.Scanner;

/**
 *
 * @author edube
 */
public class ExercicioRelacinamentoClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //criando objeto scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o nome da agenda");
        String nomeAgenda = scan.nextLine();
        System.out.println("--------------------------");
        
        String nome;
        String telefone;
        String email;
        
        //craindo objeto da classe agenda
        Agenda agenda = new Agenda(nomeAgenda);
        
        //criando array de contatos
        Contato[] contatos = new Contato[3];
        for (int i = 0; i < contatos.length; i++) {
            System.out.println("Entre com as informações do contato "+(i+1));
            //instanciando classe Contato
            Contato c = new Contato();
            //setando atributos
            System.out.println("Entre com o nome: ");
            nome = scan.nextLine();
            c.setNome(nome);
            
            System.out.println("Entre com o trelefone: ");
            telefone = scan.nextLine();
            c.setTelefone(telefone);
            
            System.out.println("Entre com o email: ");
            email = scan.nextLine();
            c.setEmail(email);
            
            System.out.println("--------------------------------------");
            
            //atribuindo valores do objeto c ao array contatos
            contatos[i] = c;
        }
        
        System.out.println();
        
        //setando contatos na agenda
        agenda.setContatos(contatos);
        //prevenindo erros
        if (agenda != null) {
            System.out.println(agenda.obterInfo());
        }
    }
}
