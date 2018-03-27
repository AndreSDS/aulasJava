/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

/**
 *
 * @author edube
 */
public class ProjetoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 1 de PHP");
        v[2] = new Video("Aula 1 de HTML5");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Pedro",22,"M","Pedrito");
        g[1] = new Gafanhoto("Maria",34,"F","Beta");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0],v[1]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());//pedro assiste aula PHP
        
        vis[1] = new Visualizacao(g[0],v[0]);
        vis[1].avaliar(85f);
        System.out.println(vis[1].toString());//pedro assite aula POO
        //System.out.println(v[0].toString());
        //System.out.println(g[1].toString());
    }
    
}
