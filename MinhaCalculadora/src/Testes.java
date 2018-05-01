/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edube
 */
public class Testes {
    public static void main(String[] args) {
        
        usandoConstantes();
        
        System.out.println("");
        
        usandoEnum();
        
        DiaSemana dia = DiaSemana.DOMINGO;
        
        System.out.println(dia.toString()+" - "+dia.getValor());
        
        Data data = new Data(1,4,2018,DiaSemana.SEXTA);
        
        DiaSemana[] dias = DiaSemana.values();
        
        for (DiaSemana d : dias) {
            System.out.println(d);   
        }
        
        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
        
        
        DiaSemana dia2 = Enum.valueOf(DiaSemana.class, "SABADO");
        System.out.println(dia2);
        
    }
    
    public static void usandoConstantes(){
        
        int segunda = DiaSemanaConstantes.SEGUNDA;
        int terca = DiaSemanaConstantes.TERCA;
        int quarta = DiaSemanaConstantes.QUARTA;
        int quinta = DiaSemanaConstantes.QUINTA;
        int sexta = DiaSemanaConstantes.SEXTA;
        int sabado = DiaSemanaConstantes.SABADO;
        int domingo = DiaSemanaConstantes.DOMINGO;
        
        System.out.println("Teste utilizando constantes no java");
          imprimeDiaSemana(segunda);
          imprimeDiaSemana(terca);
          imprimeDiaSemana(quarta);
          imprimeDiaSemana(quinta);
          imprimeDiaSemana(sexta);
          imprimeDiaSemana(sabado);
          imprimeDiaSemana(domingo);
    }
    private static void imprimeDiaSemana(int dia){
        
        switch(dia){
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }
    
    private static void usandoEnum(){
        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;
        
        System.out.println("Teste usando Enum");
         imprimeDiaSemana(segunda);
         imprimeDiaSemana(terca);
         imprimeDiaSemana(quarta);
         imprimeDiaSemana(quinta);
         imprimeDiaSemana(sexta);
         imprimeDiaSemana(sabado);
         imprimeDiaSemana(domingo);
    }
    
    private static void imprimeDiaSemana(DiaSemana dia){
        
        switch(dia){
            case SEGUNDA:
                System.out.println("Segunda-feira");
                break;
            case TERCA:
                System.out.println("Terça-feira");
                break;
            case QUARTA:
                System.out.println("Quarta-feira");
                break;
            case QUINTA:
                System.out.println("Quinta-feira");
                break;
            case SEXTA:
                System.out.println("Sexta-feira");
                break;
            case SABADO:
                System.out.println("Sábado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }
}
