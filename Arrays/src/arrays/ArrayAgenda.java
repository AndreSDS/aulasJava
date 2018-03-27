package arrays;

import java.util.Scanner;

public class ArrayAgenda {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String[][][] compromisso = new String[12][31][8];//12 meses 31 dias e 8 horas
        
        boolean sair = false;
        byte opcao;
        while (!sair) {            
            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para consultar compromisso.");
            System.out.println("Digite 0 para sair.");
            
            opcao = scan.nextByte();
            
            if (opcao == 1) {//adicionar comprimisso
                
                boolean mesValido = false;//vendo se o mês é válido
                int mes = 0;
                while (!mesValido) {
                    System.out.println("Entre com o mês do compromisso.");
                    mes = scan.nextInt();
                        if (mes > 0 && mes <= 12) {
                         mesValido = true;
                    }else{
                            System.out.println("Mês inválido digite novamente.");
                        }
                }
                
                boolean diaValido = false;//vendo se o dia é válido
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Entre com o dia do compromisso.");
                    dia = scan.nextInt();
                        if (dia > 0 && dia <= 31) {
                         diaValido = true;
                    }else{
                            System.out.println("Dia inválido digite novamente.");
                        }
                }
                
                boolean horaValida = false;//vendo se a hora é válida
                int hora = 0;
                while (!horaValida) {                    
                    System.out.println("Digite a hora do compromisso.");
                    hora = scan.nextInt();
                        if (hora > 0 && hora <= 8) {
                         horaValida = true;
                    }else{
                          System.out.println("Hora inválida. Digite novamente.");
                        }
                }
                mes--;
                dia--;//retirando 1 já que o array inicia em 0
                System.out.println("Digite o compromisso a ser agendado.");
                compromisso[mes][dia][hora] = scan.next();
            //fim da opcao 1
            }else if (opcao == 2) {
                
                boolean mesValido = false;//vendo se o mês é válido
                int mes = 0;
                while (!mesValido) {
                    System.out.println("Entre com o mês do compromisso.");
                    mes = scan.nextInt();
                        if (mes > 0 && mes <= 12) {
                         mesValido = true;
                    }else{
                            System.out.println("Mês inválido digite novamente.");
                        }
                }
                
                boolean diaValido = false;//vendo se o dia é válido
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Entre com o dia do compromisso.");
                    dia = scan.nextInt();
                        if (dia > 0 && dia <= 31) {
                         diaValido = true;
                    }else{
                            System.out.println("Dia inválido digite novamente.");
                        }
                }
                
                boolean horaValida = true;
                int hora = 0;
                while (!horaValida) {                    
                    System.out.println("Digite a hora do compromisso.");
                    hora = scan.nextInt();
                        if (hora > 0 && hora <= 24) {
                         horaValida = true;
                    }else{
                          System.out.println("Hora inválida. Digite novamente.");
                        }
                }
                mes--;
                dia--;
                System.out.println("O compromisso agendado é : ");
                System.out.println(compromisso[mes][dia][hora]);
            //fim da opcao 2
            }else if (opcao == 0) {
                sair = true;
            }else{
                System.out.println("Opção inválida. Digite novamente.");
            }
        }
    }
 
}
