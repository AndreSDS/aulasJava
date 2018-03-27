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
public class Visualizacao {
    //atributos
    private Gafanhoto espectador;
    private Video filme;
    //métodos
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setAssistido(this.espectador.getAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }
    public Gafanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }
    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc){
        int tot;
        if (porc <= 20) {
            tot = 3;
        }else  if(porc <=50){
            tot = 5;
        }else if(porc <= 90){
            tot = 8;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
}
