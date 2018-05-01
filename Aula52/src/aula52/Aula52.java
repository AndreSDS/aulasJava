package aula52;

import java.util.Scanner;

public class Aula52 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        
        int opcao = 1;
        
        while (opcao != 3) {            
            opcao = obterOpcaoMenu(scan);
            
            if (opcao == 1) {
                consultarContato(scan, agenda);
            }else if (opcao == 2) {
                adicionarContato(scan, agenda);
            }
        }
    }
    public static void adicionarContato(Scanner scan, Agenda agenda){
        System.out.println("Entre com as informações do contato");
        String nome = lerInfo(scan, "Entre com o nome");
        String telefone = lerInfo(scan, "Entre com o telefone");
        String email = lerInfo(scan, "Entre com e-mail");
        
        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setTelefone(telefone);
        contato.setEmail(email);
        
        System.out.println("Contato a ser criado");
        System.out.println(contato.toString());
        
        try {
            agenda.adicionarContato(contato);
        } catch (AgendaCheiaEsception e) {
            System.out.println(e.getMessage());
            System.out.println("Contatos na agenda");
            System.out.println(agenda.toString());
        }
    }
            
    public static void consultarContato(Scanner scan,Agenda agenda){
        String nomeContato = lerInfo(scan, "Entre com o nome do contato");
            try {
                if (agenda.consultaContatoPorNome(nomeContato) >= 0) {
                    System.out.println("Contato existe");
                }
            }catch (ContatoNaoExisteException e) {
                System.out.println(e.getMessage());
            }
        }
    
    public static String lerInfo(Scanner scan, String msg){
            System.out.println(msg);
            String entrada = scan.nextLine();
            return entrada;
    } 

    public static int obterOpcaoMenu(Scanner scan){
        
        boolean entradaVal = false;
        int opcao = 3;
        while (!entradaVal) {            
            System.out.println("Digite a opção desejada");
            System.out.println("1: Consultar contato");
            System.out.println("2: Adicionar contato");
            System.out.println("3: Sair"); 
            
            try {
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);
                
                if (opcao == 1 || opcao == 2 || opcao == 3) {
                   entradaVal = true;
                }else{
                    throw new Exception("Entrada inválida"); 
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, tente novamente \n");
            }
        }
        return opcao;
    }
}