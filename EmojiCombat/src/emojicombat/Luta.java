/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emojicombat;

import java.util.Random;

/**
 *
 * @author edube
 */
public class Luta {
    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    //métodos
    public void marcarLuta(Lutador l1,Lutador l2){
        if ((l1.getCategoria()==l2.getCategoria()) && (l1 != l2)) {
            aprovada = true;
            desafiado = l1;
            desafiante = l2;
        }else{
            aprovada = false;
            desafiado = null;
            desafiante = null;
        }
    }
    public void lutar(){
        if (aprovada) {
            desafiado.apresentar();
            desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("-----PLACAR-----");
            switch(vencedor){
                case 0:                    
                    System.out.println("Empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:                    
                    System.out.println(desafiado.getNome()+" VENCEU!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(desafiante.getNome()+" VENCEU!");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }
        }else{
            System.out.println("Esta luta não pode aconteccer.");
        }
    }
    //métodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    
}
